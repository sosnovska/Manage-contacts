package com.sosnovska.managecontacts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sosnovska.managecontacts.model.ActivityType;


@Repository
public interface ActivityTypeRepository extends CrudRepository<ActivityType, Long> {

}
