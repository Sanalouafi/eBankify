package com.example.ebankify.request;

import com.example.ebankify.model.enums.Role;
import lombok.Data;

@Data
public class RegisterRequest {
    private String username;
    private String email;
    private String password;
    private Role role;
}
