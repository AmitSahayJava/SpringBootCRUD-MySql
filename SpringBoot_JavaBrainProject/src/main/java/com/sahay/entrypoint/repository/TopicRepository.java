package com.sahay.entrypoint.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sahay.entrypoint.model.Topic;
@Repository

public interface TopicRepository extends CrudRepository<Topic, String>{

}
