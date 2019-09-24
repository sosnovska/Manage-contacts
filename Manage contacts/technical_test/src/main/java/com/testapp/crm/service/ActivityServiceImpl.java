package com.testapp.crm.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testapp.crm.model.Activity;
import com.testapp.crm.repository.ActivityRepository;

@Service
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	ActivityRepository activityRepository;

	@Override
	public Iterable<Activity> getActivities() {
		return activityRepository.findAll();
	}

	@Override
	public Optional<Activity> getActivityById(Long id) {
		return activityRepository.findById(id);
	}

	@Override
	public Activity createOrUpdateActivity(Activity activity) {
		return activityRepository.save(activity);
	}

	@Override
	public void deleteActivity(Long id) {
		activityRepository.deleteById(id);
	}

}
