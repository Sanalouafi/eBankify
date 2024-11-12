package com.example.ebankify.response;

import com.example.ebankify.model.enums.Role;
import lombok.Data;

@Data
public class RegisterResponse {
    private Long id;
    private String username;
    private String email;
    private Role role;
    private String message;
}
