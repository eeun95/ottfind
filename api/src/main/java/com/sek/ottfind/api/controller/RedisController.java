package com.sek.ottfind.api.controller;

import com.sek.ottfind.domain.common.CommonResponse;
import com.sek.ottfind.domain.common.ResultCode;
import com.sun.net.httpserver.Authenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @GetMapping("/redisTest")
    public CommonResponse addRedisKey() {
        ValueOperations<String, String> op = redisTemplate.opsForValue();
        op.set("name", "netflix");
        op.set("price", "14500");
        op.set("personal", "4");
        return new CommonResponse(ResultCode.SUCCESS);
    }

    @GetMapping("/redisTest/{key}")
    public CommonResponse getRedisKey(@PathVariable String key) {
        ValueOperations<String, String> op = redisTemplate.opsForValue();
        String value = op.get(key);
        return new CommonResponse(ResultCode.SUCCESS, value);
    }

}
