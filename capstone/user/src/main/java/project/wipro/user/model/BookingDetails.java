package project.wipro.user.model;

import java.time.LocalDate;

public class BookingDetails {

	private int bookingId;
	private int hotelId;
	private int roomId;
	private int userId;
	private LocalDate bookingDate;
	private LocalDate bookedFromDate;
	private LocalDate bookedToDate;
	private int noOfAdults;
	private int noOfChildren;
	private double amount;
	private String status;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public LocalDate getBookedFromDate() {
		return bookedFromDate;
	}
	public void setBookedFromDate(LocalDate bookedFromDate) {
		this.bookedFromDate = bookedFromDate;
	}
	public LocalDate getBookedToDate() {
		return bookedToDate;
	}
	public void setBookedToDate(LocalDate bookedToDate) {
		this.bookedToDate = bookedToDate;
	}
	public int getNoOfAdults() {
		return noOfAdults;
	}
	public void setNoOfAdults(int noOfAdults) {
		this.noOfAdults = noOfAdults;
	}
	public int getNoOfChildren() {
		return noOfChildren;
	}
	public void setNoOfChildren(int noOfChildren) {
		this.noOfChildren = noOfChildren;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
