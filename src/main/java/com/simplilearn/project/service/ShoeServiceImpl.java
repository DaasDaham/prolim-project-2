package com.simplilearn.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.project.model.Shoe;
import com.simplilearn.project.repository.ShoeRepository;

@Service(value = "shoeService")
public class ShoeServiceImpl implements ShoeService {

	@Autowired
	private ShoeRepository shoeRepository;

	public ShoeServiceImpl() {

	}

	public ShoeServiceImpl(ShoeRepository shoeRepository) {
		super();
		this.shoeRepository = shoeRepository;
	}

	@Override
	public Shoe deleteById(long theId) {
		// TODO Auto-generated method stub
		return this.shoeRepository.deleteById(theId);
		
	}

	@Override
	public Shoe save(Shoe theShoe) {
		// TODO Auto-generated method stub
		return this.shoeRepository.save(theShoe);
	}

	@Override
	public Shoe findById(long theId) {
		// TODO Auto-generated method stub
		return this.shoeRepository.findById(theId);
	}

	@Override
	public List<Shoe> findAll() {
		// TODO Auto-generated method stub
		return this.shoeRepository.findAll();
	}

	@Override
	public List<Shoe> findByColor(String theColor) {
		// TODO Auto-generated method stub
		return this.shoeRepository.findByColor(theColor);
	}

	@Override
	public List<Shoe> findByCategory(String theCategory) {
		// TODO Auto-generated method stub
		return this.shoeRepository.findByCategory(theCategory);
	}

	@Override
	public List<Shoe> findByPrice(Double price) {
		// TODO Auto-generated method stub
		return this.shoeRepository.findByPrice(price);
	}

	@Override
	public List<Shoe> findBySize(Integer theSize) {
		// TODO Auto-generated method stub
		return this.shoeRepository.findBySize(theSize);
	}

}
