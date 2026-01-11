package com.example.EmailAiApplication.dto;

public class EmailResponse {

    private String email;
    private long responseTimeMs;

    public EmailResponse() {
    }

    public EmailResponse(String email, long responseTimeMs) {
        this.email = email;
        this.responseTimeMs = responseTimeMs;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getResponseTimeMs() {
        return responseTimeMs;
    }

    public void setResponseTimeMs(long responseTimeMs) {
        this.responseTimeMs = responseTimeMs;
    }
}
