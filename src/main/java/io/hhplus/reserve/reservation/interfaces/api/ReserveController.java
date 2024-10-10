package io.hhplus.reserve.reservation.interfaces.api;

import io.hhplus.reserve.reservation.interfaces.dto.ReserveRequest;
import io.hhplus.reserve.reservation.interfaces.dto.ReserveResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reserve")
public class ReserveController {

    @GetMapping("/list/{date}")
    public ReserveResponse list(@PathVariable String date) {
        // TODO 날짜별 예약 가능 콘서트 목록 조회 API 작성
        return null;
    }

    @GetMapping("/seat/list/{id}")
    public ReserveResponse seatList(@PathVariable String id) {
        // TODO 콘서트별 예약 가능 좌석 목록 조회 API 작성
        return null;
    }

    @PostMapping("/reserve")
    public ReserveResponse reserve(@RequestBody ReserveRequest request) {
        // TODO 좌석 예약 요청 API 작성
        return null;
    }

}
