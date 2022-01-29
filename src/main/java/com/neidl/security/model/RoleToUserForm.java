package com.neidl.security.model;

import lombok.Data;
import lombok.Getter;

@Data
public class RoleToUserForm {
    private String username;
    private String roleName;
}
