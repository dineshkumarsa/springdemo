package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/customers", produces="application/json")
public class DemoController {

    @Autowired
    DemoService demoService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces="application/json" )
    public ResponseEntity<User> getCustomerById(HttpServletRequest request, @PathVariable("id") Integer userid) {

        User user1 = demoService.getUserById(userid);

return  new ResponseEntity<User>(user1, new HttpHeaders(), HttpStatus.OK);
//         return ResponseEntity.ok().body(user1);
    }
}
