package org.nice.heima.dao.Impl;

import org.nice.heima.dao.ProductMapper;
import org.nice.heima.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("productMapper")
public class ProductMapperImpl implements ProductMapper {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Product> findAll() {
        String sql="SELECT * FROM db2.product";
        jdbcTemplate.execute(sql);
        List<Product> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Product.class));
        return query;
    }
}
