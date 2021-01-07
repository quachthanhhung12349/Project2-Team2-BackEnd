/**
 * @program: project2
 * @description:
 * @author: Luke
 * @create: 2021-01-06 15:35
 **/


package com.revature.service.impl;

import com.revature.dao.IForumDAO;
import com.revature.pojo.Forum;
import com.revature.pojo.Message;
import com.revature.service.IForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForumService implements IForumService {

    @Autowired
    private IForumDAO forumDAO;


    @Override
    public Forum getForumById(int forumId) {

        return forumDAO.getForumById(forumId);
    }

    @Override
    public List<Integer> getForumIds() {
        return forumDAO.getForumIds();
    }

    @Override
    public List<Message> getMessages() {
        return forumDAO.getMessages();
    }
}


