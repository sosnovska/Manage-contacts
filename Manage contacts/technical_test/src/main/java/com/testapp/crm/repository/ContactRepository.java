package com.testapp.crm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testapp.crm.model.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
	