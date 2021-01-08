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
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@RestController

public class Haocheng {

    @Autowired
    private IForumService forumService;

    @GetMapping("/forum/{forumId}")
    public ResponseEntity<Forum> getForumsById(@PathVariable int forumId) {
        return new ResponseEntity<Forum>(forumService.getForumById(forumId), HttpStatus.OK);
    }
    @GetMapping("/forum")
    public ResponseEntity<List<Forum>> getForums(){
        return new ResponseEntity<List<Forum>>(forumService.getForums(),HttpStatus.OK);
    }
    @PostMapping("/forum")
    public ResponseEntity<Forum> postForum(@RequestBody Forum forum){
        return new ResponseEntity<Forum>(forumService.saveForum(forum),HttpStatus.CREATED);
    }



    @GetMapping("/message")
    public ResponseEntity<List<Message>> getMessages() {

        return new ResponseEntity<List<Message>>(forumService.getMessages(), HttpStatus.OK);
    }

    @PostMapping("/message")
    public ResponseEntity<Message> postMessage(@RequestBody Message message){

        SimpleDateFormat sdf = new SimpleDateFormat();// format time
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");//
        Date date = new Date();// get now time

        message.setTimeStamp(date);

        return new ResponseEntity<Message>(forumService.saveMessage(message),HttpStatus.CREATED);
    }

}


