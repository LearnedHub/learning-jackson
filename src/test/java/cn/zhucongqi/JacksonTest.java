package cn.zhucongqi;

import cn.zhucongqi.domain.User;
import cn.zhucongqi.json.Jackson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ：Jobsz
 * @project ：learing-spt
 * @date ：Created in 2019/12/19 22:02
 * @description：
 * @modified By：
 * @version:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
public class JacksonTest {

    @Autowired
    Jackson jackson;

    @Test
    public void testJackson() {
        User user = new User();
        user.setId(11);
        user.setName("jobs");

        String json = jackson.toJson(user);
        System.out.println(json);

    }

}
