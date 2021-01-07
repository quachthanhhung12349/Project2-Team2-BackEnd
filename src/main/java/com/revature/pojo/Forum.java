/**
 * @program: project2
 * @description: entity for forum
 * @author: Luke
 * @create: 2021-01-06 14:21
 **/


package com.revature.pojo;

import javax.persistence.*;

@Entity
@Table(name = "forum")
public class Forum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "forumid")
    private int forumId;

    @Column(name = "topic")
    private String topic;

    @Override
    public String toString() {
        return "Forum{" +
                "forumId=" + forumId +
                ", topic='" + topic + '\'' +
                '}';
    }

    public int getForumId() {
        return forumId;
    }

    public void setForumId(int forumId) {
        this.forumId = forumId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}


