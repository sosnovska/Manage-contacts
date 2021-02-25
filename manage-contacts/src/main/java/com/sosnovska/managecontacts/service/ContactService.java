package com.sosnovska.managecontacts.service;

import java.util.Optional;

import com.sosnovska.managecontacts.model.Contact;

public interface ContactService {

	public Iterable<Contact> getContacts();

	public Optional<Contact> getContactById(Long id);

	Contact createOrUpdateContact(Contact contact);

	void deleteContact(Long id);

}
