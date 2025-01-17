package com.plac.config.dto;

import lombok.*;

@Data
public class SocialLoginReqDto {

    @Getter
    @Setter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Login{
        private String provider;
        private String code;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class GoogleLogin{
        private String access_token;
    }
}
