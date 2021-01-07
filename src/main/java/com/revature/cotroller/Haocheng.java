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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;


@RestController

public class Haocheng {

    @Autowired
    private IForumService forumService;

    @RequestMapping("/getforum")
    public ResponseEntity<Forum> getForums(@RequestParam int forumId) {
        System.out.println(forumId);

        return new ResponseEntity<>(forumService.getForumById(forumId), HttpStatus.OK);
    }

    @RequestMapping("/getmessages")
    public ResponseEntity<List<Message>> getMessages() {

        return new ResponseEntity<List<Message>>(forumService.getMessages(), HttpStatus.OK);
    }

    @RequestMapping("/getmessages2")
    public ResponseEntity<List<Message>> getMessages2() {

        return new ResponseEntity<List<Message>>(forumService.getMessages2(), HttpStatus.OK);
    }

}


