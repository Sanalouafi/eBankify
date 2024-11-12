// src/main/java/com/example/ebankify/response/ErrorResponse.java
package com.example.ebankify.response;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ErrorResponse {
    private HttpStatus status;
    private String message;
}
