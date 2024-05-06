package project.wipro.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import project.wipro.user.model.BookingDetails;

@Entity
@Table(name="user_tbl")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int user_id;
	private String name;
	private String email;
	private String password;
	@Column(length=5)
	private String role;
	@Column(length=10)
	private String mobile;
	private String address;
	
	
	public int getUser_id() {
		return user_id;
	}

	

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
