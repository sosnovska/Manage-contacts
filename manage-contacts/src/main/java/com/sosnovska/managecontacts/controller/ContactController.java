package com.sosnovska.managecontacts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sosnovska.managecontacts.model.Contact;
import com.sosnovska.managecontacts.service.ContactService;


@RequestMapping("/api/contacts")
@RestController
public class ContactController {

	@Autowired
	ContactService contactService;

	@GetMapping("/")
	public ResponseEntity<List<Contact>> getContacts() {
		List<Contact> contacts = (List<Contact>) contactService.getContacts();
		return new ResponseEntity<List<Contact>>(contacts, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Contact> getContactById(@PathVariable Long id) {
		Contact contact = contactService.getContactById(id).get();
		return new ResponseEntity<Contact>(contact, HttpStatus.OK);
	}

	@PostMapping("/")
	public ResponseEntity<Contact> createContact(@RequestBody Contact contact) {
		Contact result = contactService.createOrUpdateContact(contact);
		return new ResponseEntity<Contact>(result, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteContact(@PathVariable Long id) {
		contactService.deleteContact(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
	public ResponseEntity<Contact> updateContact(@RequestBody Contact contact) {
		Contact result = contactService.createOrUpdateContact(contact);
		return new ResponseEntity<Contact>(result, HttpStatus.OK);
	}

}
