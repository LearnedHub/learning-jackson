package cn.zhucongqi;

import cn.zhucongqi.domain.User;
import cn.zhucongqi.json.Jackson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author ：Jobsz
 * @project ：learing-spt
 * @date ：Created in 2019/12/19 18:06
 * @description：
 * @modified By：
 * @version:
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ApplicationContext cxt = SpringApplication.run(App.class, args);
//        Jackson jackson = cxt.getBean(Jackson.class);
//
//        User user = new User();
//        user.setName("jobsz");
//        user.setId(11);
//
//        String jsonString = jackson.toJson(user);
//        System.out.println(jsonString);
//
//        User uuser = jackson.toObject(jsonString, User.class);
//        System.out.println(uuser);
    }


}
