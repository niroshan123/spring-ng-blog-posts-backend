package io.niroshan.springblog.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class AuthenticationResponse {
    private String authenticationToken;
    private String username;


    public AuthenticationResponse(String authenticationToken, String username) {
    }
}
