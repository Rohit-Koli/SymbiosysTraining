package com.CinemaBooking;

public class BookingApplications extends Thread{

	static IMaxCinemas i;
	static int tickets;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		i.Bookings(tickets);
		System.out.println("*****************************");
	}
	
	public static void main(String[] args) {
		i = new IMaxCinemas();
//		i.totalTickets=135;
		BookingApplications payTm = new BookingApplications();
		payTm.tickets=75;
		payTm.start();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		BookingApplications GooglePay = new BookingApplications();
		GooglePay.tickets=25;
		GooglePay.start();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
//		
		BookingApplications BookMyshow = new BookingApplications();
		BookMyshow.start();
		BookMyshow.tickets=25;
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
	}
}
