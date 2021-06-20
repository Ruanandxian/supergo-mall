package com.supergo.protal.controller;

import com.supergo.http.HttpResult;
import com.supergo.manager.feign.ApiItemCatFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProtalController {
    @Autowired
    private ApiItemCatFeign itemCatFeign;

    @GetMapping("/categorys/categorys")
    public Object getCategoryList(){
        HttpResult itemCat = itemCatFeign.getItemCat();
        if(itemCat.getCode()==200){
            return itemCat;
        }
        return itemCat.getMsg();

    }
}
