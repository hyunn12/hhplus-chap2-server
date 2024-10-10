package io.hhplus.reserve.token.interfaces.api;

import io.hhplus.reserve.token.interfaces.dto.TokenRequest;
import io.hhplus.reserve.token.interfaces.dto.TokenResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/token")
public class TokenController {

    @PostMapping("/generate")
    public TokenResponse generateToken(@RequestBody TokenRequest tokenRequest) {
        // TODO 토큰 발급 API 작성
        return null;
    }

}
