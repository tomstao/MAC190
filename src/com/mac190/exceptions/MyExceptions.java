package com.mac190.exceptions;

public class MyExceptions extends Exception {
    private int code;
    private String message;

    public MyExceptions(String message) {
        this.code = code;
        this.message = message;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return "Code: " + code + "\nMessage: " + message;
    }



}
