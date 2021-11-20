import com.tds.ehiam.bean.User;
import com.tds.ehiam.dao.UserImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser1 {
    ClassPathXmlApplicationContext bean;

    @Before
    public void create() {
        bean = new ClassPathXmlApplicationContext("Bean.xml");
    }

    //
    @Test
    public void test1() {
        User user = bean.getBean("userBean", User.class);
        User user1 = bean.getBean("userBean", User.class);
        System.out.println(user == user1);
    }

    //Bean的生命周期
    @Test
    public void test2() {
        UserImpl userService = bean.getBean("userImpl", UserImpl.class);
        userService.printUser(bean.getBean("userBean", User.class));
        bean.close();
    }
}
