package com.simplilearn.project.resources;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.simplilearn.project.errors.ShoeNotFoundException;
import com.simplilearn.project.model.Shoe;
import com.simplilearn.project.service.ShoeService;

@RestController
public class ShoeResource {
	@Autowired
	private ShoeService shoeService;

	@GetMapping(path = "/saadsportyshoes/shoe_api")
	public List<Shoe> listAllShoes() {

		return this.shoeService.findAll();
	}

	@GetMapping(path = "/saadsportyshoes/shoe_api/id/{id}")
	public Shoe findShoeById(@PathVariable long id) {
		
		Shoe theShoe = this.shoeService.findById(id);

		if (theShoe == null) {
			throw new ShoeNotFoundException("Shoe with following details not found - Shoe Id "+ id);
		}

		return theShoe;
	}

	@GetMapping(path = "/saadsportyshoes/shoe_api/color/{color}")
	public List<Shoe> findShoeByColor(@PathVariable String color) {
		
		List<Shoe> theShoeList = this.shoeService.findByColor(color);

		if (theShoeList.size() <= 0) {
			throw new ShoeNotFoundException("Shoe with following details not found - Color " + color);
		}

		return theShoeList;
	}

	@GetMapping(path = "/saadsportyshoes/shoe_api/category/{category}")
	public List<Shoe> findShoeByCategory(@PathVariable String category) {
		
		List<Shoe> theShoeList = this.shoeService.findByCategory(category);

		if (theShoeList.size() <= 0) {
			throw new ShoeNotFoundException("Shoe with following details not found - Shoe Category "+ category);
		}

		return theShoeList;
	}

	@GetMapping(path = "/saadsportyshoes/shoe_api/price/{price}")
	public List<Shoe> findShoeByPrice(@PathVariable Double price) {

		List<Shoe> theShoeList = this.shoeService.findByPrice(price);

		if (theShoeList.size() <= 0) {
			throw new ShoeNotFoundException("Shoe with following details not found - Shoe Price "+ price);
		}

		return theShoeList;
	}
	
	@GetMapping(path = "/saadsportyshoes/shoe_api/size/{size}")
	public List<Shoe> findShoeBySize(@PathVariable Integer size) {

		List<Shoe> theShoeList = this.shoeService.findBySize(size);

		if (theShoeList.size() <= 0) {
			throw new ShoeNotFoundException("Shoe with following details not found - Shoe Size "+ size);
		}

		return theShoeList;
	}

	@PostMapping(path = "/saadsportyshoes/shoe_api")
	public ResponseEntity<?> createShoe(@Valid @RequestBody Shoe shoe) {
		
		Shoe savedShoe = this.shoeService.save(shoe);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedShoe.getId())
				.toUri();

		return ResponseEntity.created(location).build();
	}

	@PutMapping(path = "/saadsportyshoes/shoe_api/id/{id}")
	public ResponseEntity<Shoe> updateShoe(@PathVariable long id, @RequestBody Shoe theShoe) {
				this.shoeService.save(theShoe);

		return new ResponseEntity<Shoe>(theShoe, HttpStatus.NO_CONTENT);
	}

	@DeleteMapping(path = "/saadsportyshoes/shoe_api/id/{id}")
	public ResponseEntity<Shoe> deleteShoe(@PathVariable long id) {
		
		Shoe deletedShoe = this.shoeService.deleteById(id);

		return new ResponseEntity<Shoe>(deletedShoe, HttpStatus.NO_CONTENT);
	}

}
