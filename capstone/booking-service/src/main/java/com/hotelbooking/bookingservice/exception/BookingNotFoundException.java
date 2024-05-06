package com.hotelbooking.bookingservice.exception;

public class BookingNotFoundException extends RuntimeException {

	public BookingNotFoundException() {

	}

	public BookingNotFoundException(String msg) {
		super(msg);
	}
}