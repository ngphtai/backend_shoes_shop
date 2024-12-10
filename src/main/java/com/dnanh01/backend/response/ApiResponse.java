package com.dnanh01.backend.response;

public class ApiResponse {
    private boolean status;
    private String message;

    public ApiResponse() {

    }

    public ApiResponse(boolean status, String message) {
        super();
        this.status = status;
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
