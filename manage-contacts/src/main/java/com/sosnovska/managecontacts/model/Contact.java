package com.sosnovska.managecontacts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Column(name = "firstname")
	private String firstName;

	@NotNull
	@Column(name = "lastname")
	private String lastName;

	@NotNull

	@Column(name = "emailaddress")
	private String emailAddress;

	@Column(name = "telephonenumber")
	private String telephoneNumber;

	private String address1;

	private String address2;

	private String city;

	@Column(name = "postcode")
	private String postCode;
}
