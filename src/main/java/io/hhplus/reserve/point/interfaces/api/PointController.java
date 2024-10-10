package io.hhplus.reserve.point.interfaces.api;

import io.hhplus.reserve.point.interfaces.dto.PointRequest;
import io.hhplus.reserve.point.interfaces.dto.PointResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/point")
public class PointController {

    @GetMapping("/{id}")
    public PointResponse getPoint(@PathVariable Long id) {
        // TODO 포인트 조회 API 작성
        return null;
    }

    @PostMapping("/charge")
    public PointResponse charge(@RequestBody PointRequest pointRequest) {
        // TODO 포인트 충전 API 작성
        return null;
    }

}
