package com.example.backend.business;

//import java.io.IOException;
import java.util.Objects;

//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.example.backend.exception.BaseException;
import com.example.backend.exception.UserException;
import com.example.backend.model.RegisterRequest;

@Service
public class TestBusiness {
    //TestBusiness ของ TestApi
    //Api มีอะไร Business ก็มีคล้ายกัน
    // public String register(RegisterRequest request) throws IOException{
    //     //ดักจับว่าเมื่อเกิดเออเร่อจะทำอย่างไรต่อ
    //     if(request == null){
    //         throw new IOException("null.request");
    //     }

    //     //validate emil
    //     if(Objects.isNull(request.getEmail()) ){
    //         throw new IOException("null.email");
    //     }

    //     //validate..

    //     return "";

    public String register(RegisterRequest request) throws BaseException {
        //ดักจับว่าเมื่อเกิดเออเร่อจะทำอย่างไรต่อ
        if(request == null){
            throw UserException.requestNull();
        }

        //validate emil
        if(Objects.isNull(request.getEmail()) ){
            throw UserException.emailNull();
        }

        //validate..

        return "";

    }

}
