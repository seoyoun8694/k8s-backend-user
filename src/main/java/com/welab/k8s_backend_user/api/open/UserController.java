package com.welab.k8s_backend_user.api.open;

import com.welab.k8s_backend_user.common.dto.ApiResponseDto;
import com.welab.k8s_backend_user.common.web.context.GatewayRequestHeaderUtils;
import com.welab.k8s_backend_user.domain.dto.SiteUserRegisterDto;
import com.welab.k8s_backend_user.remote.alim.RemoteAlimService;
import com.welab.k8s_backend_user.service.SiteUserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/api/user/v1", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class UserController {
    private final SiteUserService siteUserService;
    private final RemoteAlimService remoteAlimService;

    @GetMapping(value = "/test")
    public ApiResponseDto<String> test() {
// String response = remoteAlimService.sms();
        String userId = GatewayRequestHeaderUtils.getUserIdOrThrowException();
        log.info("userId = {}", userId);
        return ApiResponseDto.createOk(userId);
    }
}