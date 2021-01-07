package com.revature.dao;

import com.revature.pojo.Forum;
import com.revature.pojo.Message;

import java.util.List;


public interface IForumDAO {
    Forum getForumById(int forumId);
    List<Message> getMessages();

}
