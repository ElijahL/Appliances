package com.epam.appliance.former;

public class FormerException extends Exception {
    public FormerException() {
    }

    public FormerException(String message) {
        super(message);
    }

    public FormerException(Exception e){
        super(e);
    }

    public FormerException(String message, Exception e){
        super(message, e);
    }
}
