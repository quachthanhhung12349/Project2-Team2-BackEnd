package com.revature.service;

import com.revature.pojo.Forum;
import com.revature.pojo.Message;

import java.util.List;

public interface IForumService {
    Forum getForumById(int forumId);

    List<Integer> getForumIds();

    List<Message> getMessages();

    List<Message> getMessages2();
}
