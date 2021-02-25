package com.sosnovska.managecontacts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sosnovska.managecontacts.model.ActivityType;
import com.sosnovska.managecontacts.repository.ActivityTypeRepository;


@Service
public class ActivityTypeServiceImpl implements ActivityTypeService {

	@Autowired
	ActivityTypeRepository repository;
	
	@Override
	public Iterable<ActivityType> findAll() {
		return repository.findAll();
	}

}
