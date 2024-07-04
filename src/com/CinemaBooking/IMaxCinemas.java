package com.CinemaBooking;

public class IMaxCinemas {

	static int totalTickets=100;
	
  synchronized void Bookings(int tickets) {
		if(totalTickets>=tickets) {
			System.out.println("Your seat is Booked !");
			totalTickets=totalTickets-tickets;
			double remaining_tickets=totalTickets;
			System.out.println("Remainig Tickets are :"+remaining_tickets);
		}else {
			throw new EmptySeatsException("No remaining tickets as per your need");
		}
	}
}
