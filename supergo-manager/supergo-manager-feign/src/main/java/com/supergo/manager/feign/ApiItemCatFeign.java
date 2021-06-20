package com.supergo.manager.feign;

import com.supergo.http.HttpResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("supergo-manager")
public interface ApiItemCatFeign {
    @GetMapping("/itemcat/cat/list")
    HttpResult getItemCat();
}
