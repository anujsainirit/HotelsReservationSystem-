package com.epam.reservation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDto {
	private int id;
	private Boolean isActive;
	private String userName;
	private int hotelId;
	private int partyMix;
	private String checkInDate;
	private String checkOutDate;
	private float totalCost;
	private String bookingStatus;
	private long paymentId;
	
}