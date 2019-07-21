package com.alpha.akash.error;

/**
 * @author : akashdhar
 * @date : 21-07-2019
 * @time : 02:51 PM
 */
public enum ErrorCode {

    success(null);

    private final int httpStatus;
    private String message;

    ErrorCode(String message, int httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }

    ErrorCode(String message) {
        this.message = message;
        this.httpStatus = 200;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ErrorCode{" +
                "httpStatus=" + httpStatus +
                ", message='" + message + '\'' +
                '}';
    }
}
