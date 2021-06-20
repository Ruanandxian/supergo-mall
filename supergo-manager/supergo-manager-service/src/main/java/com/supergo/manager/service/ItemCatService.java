package com.supergo.manager.service;

import com.supergo.http.HttpResult;
import com.supergo.pojo.Itemcat;
import com.supergo.service.base.BaseService;

public interface ItemCatService extends BaseService<Itemcat> {
    HttpResult getItemcCatList();
}
