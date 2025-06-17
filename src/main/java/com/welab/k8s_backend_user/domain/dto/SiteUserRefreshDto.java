package com.welab.k8s_backend_user.domain.dto;

import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotBlank;

@Getter
@Setter
public class SiteUserRefreshDto {
    @NotBlank(message = "리프레시 토큰을 입력하세요.")private String token;
}
