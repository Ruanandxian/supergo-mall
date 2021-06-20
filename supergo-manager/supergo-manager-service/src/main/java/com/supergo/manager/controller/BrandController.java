package com.supergo.manager.controller;


import com.supergo.http.HttpResult;
import com.supergo.manager.service.BrandService;
import com.supergo.manager.service.Impl.BrandServiceImpl;
import com.supergo.page.PageResult;
import com.supergo.pojo.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @PostMapping("query/{page}/{rows}")
    public HttpResult getBrandList(@RequestBody Brand brand, @PathVariable int page,@PathVariable int rows){
        PageResult page1 = brandService.findPage(page, rows, brand);
        return HttpResult.ok(page1);
    }
}
