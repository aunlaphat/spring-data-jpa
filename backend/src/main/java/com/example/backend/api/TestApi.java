package com.example.backend.api;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.business.TestBusiness;
import com.example.backend.exception.BaseException;
import com.example.backend.model.RegisterRequest;
import com.example.backend.model.TestResponse;

@RestController
@RequestMapping("/test") // กำหนดพาท ควรกำหนดที่หัวคลาส //ทุกๆ api ภายในต้องขึ้นต้นพาทด้วย test
public class TestApi {

    // method:1 field injection
    // @Autowired
    // private TestBusiness business;

    // met:2 Construc injec วิธีนี้จะทำให้โค้ดทำงานได้ไวกว่ามีประสิทธิภาพกว่า
    private final TestBusiness business;
    public TestApi(TestBusiness business) {
        this.business = business;
    }

    @GetMapping // เอาไว้เก็บข้อมูล
    public TestResponse test() {
        TestResponse response = new TestResponse();
        response.setName("Fa");
        response.setFood("KFC");

        return response;
    }

    @GetMapping
    @RequestMapping("/2")
    public TestResponse test2() {
        TestResponse response = new TestResponse();
        response.setName("Fa2");
        response.setFood("KFC2");

        return response;
    }

    @PostMapping
    @RequestMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest request) throws BaseException{
        // ส่ง data ออกไปเป็น json
        // try {
        //     String response = business.register(request);
        //     return ResponseEntity.ok(response);
        // } catch (IOException e) {
        //     return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).build();
        //    // e.printStackTrace();
        // } // ข้อมูลjsonที่เราพิมลงpostman จะถูกส่งออกมาในรูปของrequest เมื่อทำการ post
                                      
        // link นี้คือหลักการทำการโพส

        //ในทุกๆการรีเทินเราสามารถคัสตอมได้ว่าอยากให้มันรีเทินเมื่อสถานะ200คือส่งได้ หรือไม่ใช่200 คือส่งไม่ได้

        String response = business.register(request);
        return ResponseEntity.ok(response);
    }

}
