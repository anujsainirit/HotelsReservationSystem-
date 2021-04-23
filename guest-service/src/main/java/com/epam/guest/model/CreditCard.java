package com.epam.guest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditCard {
	private long cardNumber;
	private String expairDate;
	private String cadrHolderName;
	private String cardType;
}