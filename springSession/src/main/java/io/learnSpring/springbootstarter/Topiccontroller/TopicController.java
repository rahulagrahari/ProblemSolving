package io.learnSpring.springbootstarter.Topiccontroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topics;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopic() {
		return topics.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topics.getTopicById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopics(@RequestBody Topic topic) {
		topics.addTopics(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopics(@PathVariable String id, @RequestBody String newid) {
		topics.updateTopic(id, newid);
	}
	
	
	
}
