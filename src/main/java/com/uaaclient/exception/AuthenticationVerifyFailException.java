package com.uaaclient.exception;

/**
 * Created by liujia on 2017/9/23.
 */
public class AuthenticationVerifyFailException extends RuntimeException {
    public AuthenticationVerifyFailException(String message){
        super(message);
    }
}
