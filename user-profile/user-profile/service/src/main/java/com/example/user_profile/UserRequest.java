package com.example.user_profile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class UserRequest {
    private String username;
    private String email;
    private String firstName;
    private String lastName;
}
