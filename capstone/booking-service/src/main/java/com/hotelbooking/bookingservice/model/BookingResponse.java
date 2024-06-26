package com.hotelbooking.bookingservice.model;

import lombok.Data;

@Data
public class BookingResponse {
	
	private String customerName;
	private String hotelName;
	private String roomNo;
	private String roomType;
	private double amount;
	
	private String hotelPhone1;
	private String hotelPhone2;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getHotelPhone1() {
		return hotelPhone1;
	}
	public void setHotelPhone1(String hotelPhone1) {
		this.hotelPhone1 = hotelPhone1;
	}
	public String getHotelPhone2() {
		return hotelPhone2;
	}
	public void setHotelPhone2(String hotelPhone2) {
		this.hotelPhone2 = hotelPhone2;
	}


}
