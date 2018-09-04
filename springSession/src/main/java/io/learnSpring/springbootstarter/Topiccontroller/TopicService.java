package io.learnSpring.springbootstarter.Topiccontroller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepo;
	
	
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		
		topicRepo.findAll().forEach(topic -> topics.add((Topic) topic));
		return topics;
	}
	
	public Topic getTopicById(String id) {
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepo.findById(id).get();
				
	}

	public void addTopics(Topic topic) {
		topicRepo.save(topic);
		
	}

	public void updateTopic(String id, String newid) {
//		Topic t1 = topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
//		t1.setId(newid);
		
		
	}


		
	
	
}
