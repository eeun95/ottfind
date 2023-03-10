package com.sek.ottfind.api.exception;

import com.sek.ottfind.domain.common.CommonResponse;
import com.sek.ottfind.domain.common.ErrorCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(ContentNotFoundException.class)
    public CommonResponse contentNotFoundHandler(ContentNotFoundException e) {
        return new CommonResponse(ErrorCode.NOT_FOUND_OTT_CONTENT);
    }
    @ExceptionHandler(ReviewNotFoundException.class)
    public CommonResponse reviewNotFoundHandler(ReviewNotFoundException e) {
        return new CommonResponse(ErrorCode.NOT_FOUND_REVIEW);
    }
}
