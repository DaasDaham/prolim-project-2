package com.simplilearn.project.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "UserTable")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "username")
	private String username;
	
	@Column(name = "emailAddress")
	private String emailAddress;
	
	
	@Column(name = "hasSignedUp")
	private Boolean hasSignedUp;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long id, String username, String emailAddress, Boolean hasSignedUp) {
		super();
		this.id = id;
		this.username = username;
		this.emailAddress = emailAddress;
		this.hasSignedUp = hasSignedUp;
	}

	@Override
	public int hashCode() {
		return Objects.hash(emailAddress, hasSignedUp, id, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(emailAddress, other.emailAddress) && Objects.equals(hasSignedUp, other.hasSignedUp)
				&& Objects.equals(id, other.id) && Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", emailAddress=" + emailAddress + ", hasSignedUp="
				+ hasSignedUp + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Boolean getHasSignedUp() {
		return hasSignedUp;
	}

	public void setHasSignedUp(Boolean hasSignedUp) {
		this.hasSignedUp = hasSignedUp;
	}

	


}
