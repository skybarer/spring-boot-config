package com.alpha.akash.exception;

/**
 * @author : akashdhar
 * @date : 21-07-2019
 * @time : 11:53 AM
 */
public class NoSuchKeyException extends RuntimeException {

    public NoSuchKeyException() {
    }

    public NoSuchKeyException(String message) {
        super(message);
    }

    public NoSuchKeyException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchKeyException(Throwable cause) {
        super(cause);
    }

    public NoSuchKeyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
