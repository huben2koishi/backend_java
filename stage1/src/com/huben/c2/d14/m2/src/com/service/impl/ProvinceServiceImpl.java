package com.service.impl;

import com.dao.impl.ProvinceDaoImpl;
import com.domain.Province;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.ProvinceService;
import com.util.JedisPoolUtils;
import redis.clients.jedis.Jedis;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService {
    private ProvinceDaoImpl provinceDao = new ProvinceDaoImpl();

    @Override
    public List<Province> findProvince() {
        return provinceDao.findProvince();
    }

    @Override
    public String findProvinceJSON() {
        Jedis jedis = JedisPoolUtils.getJedis();
        String province_json = jedis.get("province");

        if (province_json == null || province_json.length() == 0) {
            List<Province> province = provinceDao.findProvince();
            ObjectMapper mapper = new ObjectMapper();

            try {
                province_json = mapper.writeValueAsString(province);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }

            jedis.set("province", province_json);

            jedis.close();

        }

        return province_json;
    }
}
