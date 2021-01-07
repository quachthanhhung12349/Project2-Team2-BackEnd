/**
 * @program: project2
 * @description:
 * @author: Luke
 * @create: 2021-01-06 12:06
 **/


package com.revature.cotroller;

import com.revature.pojo.Forum;
import com.revature.pojo.Message;
import com.revature.service.IForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class test {

    @Autowired
    private IForumService forumService;

    @RequestMapping("/getforum")
    public ResponseEntity<Forum> getForum() {

        System.out.println(forumService.getForumById(1));
        return new ResponseEntity<>(forumService.getForumById(1), HttpStatus.OK);
    }

    @RequestMapping("/getmessages")
    public ResponseEntity<List<Message>> getMessages() {
        List<Message> messages = forumService.getMessages();
        for (Message message : messages) {
            System.out.println(message);
        }

        return new ResponseEntity<List<Message>>(forumService.getMessages(), HttpStatus.OK);
    }

}


