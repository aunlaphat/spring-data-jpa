package com.example.backend.model;

import lombok.Data;

//เอาไว้ output เวลาคนเรียก api ไปหา
@Data //ไม่จำเป็นต้องสร้าง get,setให้กับวัตถุเพราะสามารถใช้ Data lombok แทนได้
public class TestResponse { 
    //เอาไว้ output เวลาคนเรียก api ไปหา

    private String name;
    private String food;

}
