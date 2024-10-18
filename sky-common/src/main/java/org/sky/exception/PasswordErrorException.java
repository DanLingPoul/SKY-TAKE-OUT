package org.sky.exception;

import com.fasterxml.jackson.databind.ser.Serializers;

/**
 * 密码异常错误
 */
public class PasswordErrorException extends BaseException {
    public PasswordErrorException() {}

    public PasswordErrorException(String msg) {
        super(msg);
    }
}
