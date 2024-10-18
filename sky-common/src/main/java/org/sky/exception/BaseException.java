package org.sky.exception;

import com.fasterxml.jackson.databind.ser.Serializers;

/**
 * 业务异常
 */
public class BaseException extends RuntimeException {
    public BaseException() {
    }

    public BaseException(String msg) {
        super(msg);
    }
}
