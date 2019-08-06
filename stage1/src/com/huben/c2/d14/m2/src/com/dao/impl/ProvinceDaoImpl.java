package com.dao.impl;

import com.dao.ProvinceDao;
import com.domain.Province;
import com.util.DruidUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ProvinceDaoImpl implements ProvinceDao {
    private JdbcTemplate template = new JdbcTemplate(DruidUtils.getDataSource());

    @Override
    public List<Province> findProvince() {
        String sql = "SELECT * FROM province";
        return template.query(sql, new BeanPropertyRowMapper<>(Province.class));
    }
}
