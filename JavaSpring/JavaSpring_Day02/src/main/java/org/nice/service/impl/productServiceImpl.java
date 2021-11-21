package org.nice.service.impl;

import org.nice.dao.ProductDao;
import org.nice.pojo.Product;
import org.nice.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "productService")
public class productServiceImpl implements productService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getAllProduct() {
        return productDao.getAllProduct();
    }
}
