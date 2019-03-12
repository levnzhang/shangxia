package com.baizhi;

import com.baizhi.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShangxiaApplicationTests {
    @Autowired
    private AdminService asi;
    @Test
    public void contextLoads() {
        Map<String, String> admin = asi.login("admin", "123");
        System.out.println(admin);
    }

}
