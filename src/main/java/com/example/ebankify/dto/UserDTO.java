package com.example.ebankify.dto;

import com.example.ebankify.model.enums.Role;
import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String username;
    private String email;
    private Role role;
}
