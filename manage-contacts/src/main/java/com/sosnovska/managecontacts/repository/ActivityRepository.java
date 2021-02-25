package com.sosnovska.managecontacts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sosnovska.managecontacts.model.Activity;

@Repository
public interface ActivityRepository extends CrudRepository<Activity, Long> {
}
