package io.hhplus.reserve.payment.interfaces.api;

import io.hhplus.reserve.payment.interfaces.dto.PaymentRequest;
import io.hhplus.reserve.payment.interfaces.dto.PaymentResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @PostMapping("/payment")
    public PaymentResponse payment(@RequestBody PaymentRequest request) {
        // TODO 결제 API 작성
        return null;
    }

}
