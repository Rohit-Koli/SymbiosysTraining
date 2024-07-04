package com.CinemaBooking;

public class EmptySeatsException extends RuntimeException{

	EmptySeatsException(String msg){
		super(msg);
	}
}
