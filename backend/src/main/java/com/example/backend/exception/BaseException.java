package com.example.backend.exception;

public abstract class BaseException extends Exception {
    //สร้างการดักจับเออเร่อเพื่อเจาะจงแต่ละสเตตัสให้ลึกมากขึ้น แต่ตามจริงแล้วเราสามารถใช้ของระบบได้ (IOException) โดยไม่ต้องสร้างเอง แต่อาจไม่เจาะจงพอ

    public BaseException(String code){
        super(code);
    }

}
