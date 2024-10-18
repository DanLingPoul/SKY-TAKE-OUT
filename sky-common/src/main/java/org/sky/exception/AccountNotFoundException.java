package org.sky.exception;

public class AccountNotFoundException extends BaseException{
    public AccountNotFoundException() {
    }

    public AccountNotFoundException(String msg) {
        super(msg);
    }
}
