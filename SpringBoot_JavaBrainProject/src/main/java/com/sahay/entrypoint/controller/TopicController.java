package com.sahay.entrypoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sahay.entrypoint.model.Topic;
import com.sahay.entrypoint.service.TopicService;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;
	
	@PostMapping("/topic/add")
	public String addTopic(@RequestBody Topic topic) {
		topicService.saveTopic(topic);
		return "One Topic Created";
	}
	@PostMapping("/topic/addall")
	public String addAll(@RequestBody Topic[] topic) {
		topicService.addAllTopics(topic);
		return topic.length+ " Topics added";
	}
	
	@GetMapping("/topic/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopicById(id);
	}
	
	@GetMapping("/topic/getall")
	public Iterable<Topic> getAllTopic(){
		return topicService.getAllTopic();
	}
	
	@PutMapping("/topic/modify")
	public void modifyTopic(@RequestBody Topic topic) {
		topicService.saveTopic(topic);
	}
	
	@DeleteMapping("/topic/delete/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}

}
