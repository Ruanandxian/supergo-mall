package com.supergo.manager.controller;


import com.supergo.http.HttpResult;
import com.supergo.manager.feign.ApiBrandFeign;
import com.supergo.pojo.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("brand")
//@CrossOrigin
public class BrandController {
    @Autowired
    private ApiBrandFeign apiBrandFeign;

    @PostMapping("query/{page}/{rows}")
    public HttpResult getBrandList(@RequestBody Brand brand, @PathVariable int page, @PathVariable int rows) {
        HttpResult brandList = apiBrandFeign.getBrandList(brand, page, rows);
        return brandList;
    }
}
