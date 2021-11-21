import org.junit.Test;
import org.junit.runner.RunWith;
import org.nice.pojo.Product;
import org.nice.service.impl.productServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestAll {

    @Test
    public void test01(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("applicationContext.xml");
        productServiceImpl ps = cpx.getBean("productService", productServiceImpl.class);
        List<Product> allProduct = ps.getAllProduct();
        System.out.println(allProduct);
    }
}
