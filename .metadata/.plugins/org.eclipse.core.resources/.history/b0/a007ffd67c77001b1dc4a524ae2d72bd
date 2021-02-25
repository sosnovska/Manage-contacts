package com.testapp.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testapp.crm.model.ActivityType;
import com.testapp.crm.service.ActivityTypeService;

@RequestMapping("/api/activitytypes")
@RestController
public class ActivityTypeController {

	
	@Autowired
	ActivityTypeService activityTypeService;
	
	@GetMapping("/")
	public ResponseEntity<List<ActivityType>> getActivityTypes() {
		List<ActivityType> activityTypes = (List<ActivityType>) activityTypeService.findAll();
		return new ResponseEntity<List<ActivityType>>(activityTypes, HttpStatus.OK);
	}
}
