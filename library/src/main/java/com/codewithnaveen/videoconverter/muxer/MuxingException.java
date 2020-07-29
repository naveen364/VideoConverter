package com.codewithnaveen.videoconverter.muxer;

public class MuxingException extends RuntimeException {

    public MuxingException(String message) {
        super(message);
    }

    public MuxingException(String message, Throwable cause) {
        super(message, cause);
    }
}
