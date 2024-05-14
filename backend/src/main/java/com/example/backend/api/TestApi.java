package com.example.backend.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.model.TestResponse;

@RestController
@RequestMapping("/test") //กำหนดพาท ควรกำหนดที่หัวคลาส //ทุกๆ api ภายในต้องขึ้นต้นพาทด้วย test
public class TestApi {

    @GetMapping //เอาไว้เก็บข้อมูล
    public TestResponse test(){
        TestResponse response = new TestResponse();
        response.setName("Fa");
        response.setFood("KFC");

        return response;
    }

    @GetMapping
    @RequestMapping("/2")
    public TestResponse test2(){
        TestResponse response = new TestResponse();
        response.setName("Fa2");
        response.setFood("KFC2");

        return response;
    }

    // @PostMapping
    // public String register(){
    //    // return()
    // }

}
