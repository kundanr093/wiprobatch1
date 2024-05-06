package com.hotelbooking.bookingservice.model;

import lombok.Data;

@Data
public class Room {
    private int roomId;
	private String roomNo;
	private String roomType;
	private double ratePerDay;
	private boolean available;
	private Hotel hotel;
	
	
	

}
