package com.example.backend.exception;

public class UserException extends BaseException{
    //ทำการ extend มาจาก baseexception

    public UserException(String code){
        super("user." + code);
    }

    public static UserException requestNull(){
        return new UserException("register.email.null");
        //ทุกการสร้าง obj จะมีค่านี้รีเทินออกมา user.register.email.null ตามด้านบน user.code
    }

    //user.register.email.null
    public static UserException emailNull(){
        return new UserException("register.email.null");
        //ทุกการสร้าง obj จะมีค่านี้รีเทินออกมา user.register.email.null ตามด้านบน user.code
    }

}
