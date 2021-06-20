package com.supergo.manager.controller;

import com.supergo.http.HttpResult;
import com.supergo.manager.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("itemcat")
public class ItemCatController {
    @Autowired
    ItemCatService itemCatService;



    @GetMapping("/cat/list")
    public HttpResult getItemCat(){
        HttpResult itemcCatList = itemCatService.getItemcCatList();
        return itemcCatList;
    }
}
