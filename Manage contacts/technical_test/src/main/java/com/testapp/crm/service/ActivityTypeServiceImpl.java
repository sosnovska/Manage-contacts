package com.testapp.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testapp.crm.model.ActivityType;
import com.testapp.crm.repository.ActivityTypeRepository;

@Service
public class ActivityTypeServiceImpl implements ActivityTypeService {

	@Autowired
	ActivityTypeRepository repository;
	
	@Override
	public Iterable<ActivityType> findAll() {
		return repository.findAll();
	}

}
