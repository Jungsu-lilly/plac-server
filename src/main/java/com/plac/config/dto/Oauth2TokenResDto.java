package com.plac.config.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Oauth2TokenResDto {
    String access_token;
    String token_type;
    String refresh_token;
    String expires_in;
    String scope;
    String refresh_token_expires_in;
}
