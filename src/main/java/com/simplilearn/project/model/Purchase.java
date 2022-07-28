package com.simplilearn.project.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "PurchaseTable")
public class Purchase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "userId")
	private Long userId;

	@Column(name = "shoeId")
	private Long shoeId;

	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private Date date;

	@ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "shoeId", referencedColumnName = "id", insertable = false, updatable = false)
	private Shoe shoeObject;

	@ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "userId", referencedColumnName = "id", insertable = false, updatable = false)
	private User userObject;

	
	
	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Purchase(Long id, Long userId, Long shoeId, Date date, Shoe shoeObject, User userObject) {
		super();
		this.id = id;
		this.userId = userId;
		this.shoeId = shoeId;
		this.date = date;
		this.shoeObject = shoeObject;
		this.userObject = userObject;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Long getUserId() {
		return userId;
	}



	public void setUserId(Long userId) {
		this.userId = userId;
	}



	public Long getShoeId() {
		return shoeId;
	}



	public void setShoeId(Long shoeId) {
		this.shoeId = shoeId;
	}



	public Date getDate() {
		return date;
	}
	
    public void setDate(String date){
        try {
            this.date = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

	public Shoe getShoeObject() {
		return shoeObject;
	}



	public void setShoeObject(Shoe shoeObject) {
		this.shoeObject = shoeObject;
	}



	public User getUserObject() {
		return userObject;
	}



	public void setUserObject(User userObject) {
		this.userObject = userObject;
	}



	@Override
	public int hashCode() {
		return Objects.hash(date, id, shoeId, shoeObject, userId, userObject);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Purchase other = (Purchase) obj;
		return Objects.equals(date, other.date) && Objects.equals(id, other.id) && Objects.equals(shoeId, other.shoeId)
				&& Objects.equals(shoeObject, other.shoeObject) && Objects.equals(userId, other.userId)
				&& Objects.equals(userObject, other.userObject);
	}



	@Override
	public String toString() {
		return "Purchase [id=" + id + ", userId=" + userId + ", shoeId=" + shoeId + ", date=" + date + ", shoeObject="
				+ shoeObject + ", userObject=" + userObject + "]";
	}





	
}
