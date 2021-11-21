package org.nice.dao.impl;

import org.nice.dao.ProductDao;
import org.nice.pojo.Product;
import org.nice.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository("productDao")
public class productDaoImpl implements ProductDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Product> getAllProduct() {
        String sql="SELECT * FROM product";
        jdbcTemplate.execute(sql);
        List<Product> queryResult = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Product.class));
        return queryResult;
    }
}
