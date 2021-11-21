package org.nice.heima;

import org.nice.heima.config.IOCConfig;
import org.nice.heima.dao.ProductMapper;
import org.nice.heima.pojo.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {IOCConfig.class})
public class TestAll {

    @Autowired
//    @Qualifier(value = "productMapper")
    private ProductMapper productMapper;

    @Test
    public void Test1(){
        List<Product> all = productMapper.findAll();
        System.out.println(all);
    }
}
