package com.sosnovska.managecontacts.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sosnovska.managecontacts.model.Contact;
import com.sosnovska.managecontacts.repository.ContactRepository;


@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactRepository contactRepository;

	@Override
	public Iterable<Contact> getContacts() {
		return contactRepository.findAll();
	}

	@Override
	public Optional<Contact> getContactById(Long id) {
		return contactRepository.findById(id);
	}
	
	@Override
	public Contact createOrUpdateContact(Contact contact) {
		return contactRepository.save(contact);
	}
	
	@Override
	public void deleteContact(Long id) {
		contactRepository.deleteById(id);
	}

}
