package org.nice.heima.dao;

import org.nice.heima.pojo.Product;


import java.util.List;


public interface ProductMapper {

    List<Product> findAll();
}
