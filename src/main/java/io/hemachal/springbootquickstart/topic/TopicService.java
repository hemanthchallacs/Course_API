package io.hemachal.springbootquickstart.topic;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Business Service
@Service
public class TopicService {

    //this will be a static type mutable arraylist
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Spring1", "Spring Framework", "Spring framework description"),
            new Topic("Spring2", "Spring Framework", "Spring framework description")
    ));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().
                filter(
                    topic -> topic.getId().equals(id)
                ).findFirst().get();

    }

    public void addTopic(Topic topic)
    {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic){
        for (int i = 0 ;i< topics.size() ;i++)
        {
            Topic t = topics.get(i);
            if(t.getId().equals(topic.getId())){
                topics.set(i , topic);
                break;
            }
        }

    }

    public String deleteTopic(String id) {
        for (int i = 0 ;i< topics.size() ;i++)
        {
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
               topics.remove(t);
               return "Deleted!"+id;
            }
        }
        return id+" not found";
    }
}
