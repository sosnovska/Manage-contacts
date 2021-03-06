package com.sosnovska.managecontacts.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Activity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="contact_id")
	private Contact contact;
	
	private String title;
	
	@NotNull
	private String notes;
	
	@NotNull
	@Column(name = "duedate")
	private Calendar dueDate;
	
	@ManyToOne
	@JoinColumn(name = "activitytype")
	private ActivityType activityType;
}
