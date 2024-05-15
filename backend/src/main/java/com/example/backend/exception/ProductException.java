package com.example.backend.exception;


public class ProductException extends BaseException{

    public ProductException(String code){
        super("product." + code); //ส่งค่าออกไปว่า product เออเร่อที่เงื่อนไขใด ในรูป code ตามด้านล่าง
    }

    public static ProductException notFound(){
        return new ProductException("not.found");
        //ทุกการสร้าง obj จะมีค่านี้รีเทินออกมา user.register.email.null ตามด้านบน user.code
    }

    //user.register.email.null
    public static UserException emailNull(){
        return new UserException("register.email.null");
        //ทุกการสร้าง obj จะมีค่านี้รีเทินออกมา user.register.email.null ตามด้านบน user.code
    }


}
