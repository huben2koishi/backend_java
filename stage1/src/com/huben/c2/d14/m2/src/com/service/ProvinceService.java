package com.service;

import com.domain.Province;

import java.util.List;

public interface ProvinceService {
    List<Province> findProvince();

    String findProvinceJSON();
}
