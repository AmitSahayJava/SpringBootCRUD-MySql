package com.sahay.entrypoint.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sahay.entrypoint.model.Topic;
import com.sahay.entrypoint.repository.TopicRepository;

@Service
public class TopicService {
	@Autowired
    private TopicRepository topicRepository;

	public void saveTopic(Topic topic) {
		topicRepository.save(topic);		
	}

	public Topic getTopicById(String id) {
		return topicRepository.findOne(id);
	}

	public Iterable<Topic> getAllTopic() {
		return topicRepository.findAll();
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
		
	}

	public void addAllTopics(Topic[] topic) {
		for (Topic t : topic) {
			topicRepository.save(t);
		}
		
	}
}
