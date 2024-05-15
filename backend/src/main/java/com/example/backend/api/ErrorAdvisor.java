package com.example.backend.api;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.backend.exception.BaseException;

import lombok.Data;

@ControllerAdvice
public class ErrorAdvisor {

    //ทำให้ค่า return ไปหา frontend เมื่อเกิดเออเร่อ จัดรูปแบบให้สวยขึ้น จะช่วยทำให้หน้าบ้านทำงานง่ายขึ้น
    @ExceptionHandler(BaseException.class)
    public ResponseEntity<ErrorResponse> handleBaseException(BaseException e){
        //รับพารามิเตอ BaseExcept เข้ามาในรูป e แล้วเข้าเงื่อนไขในบล้อค
        ErrorResponse response = new ErrorResponse();
        response.setError(e.getMessage()); //from base and excep
        response.setStatus(HttpStatus.EXPECTATION_FAILED.value()); //set ให้ค่ารีเทินสเตตัสออกมาเป็น 417 
        return new ResponseEntity<>(response, HttpStatus.EXPECTATION_FAILED);

    }

    @Data //add get set
    public static class ErrorResponse {
        private LocalDateTime timestamp = LocalDateTime.now(); //show time ปจบ.ที่เกิดเออเร่อ
        private int status; //สถานะเออเร่อ
        private String error; //show error ว่าเกี่ยวกับอะไร 
    
        
    }

}
