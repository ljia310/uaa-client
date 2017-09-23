package com.uaaclient.exception;

/**
 * Created by liujia on 2017/9/23.
 */
public class AuthenticationServerErrorException extends RuntimeException{
    public AuthenticationServerErrorException(String message){
        super(message);
    }
}
