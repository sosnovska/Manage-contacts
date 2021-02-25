package com.sosnovska.managecontacts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sosnovska.managecontacts.model.Contact;


@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
	