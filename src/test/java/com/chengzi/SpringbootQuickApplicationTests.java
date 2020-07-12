package com.chengzi;

import com.chengzi.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)  //用Spring驱动器跑而不是junit
@SpringBootTest               //表明为SpringBoot单元测试
class SpringbootQuickApplicationTests {

    @Autowired
    Person person;
    //记录器
    Logger logger = LoggerFactory.getLogger(SpringbootQuickApplicationTests.class);

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {

        System.out.println("数据源：  "+dataSource.getClass());

        Connection connection = dataSource.getConnection();
        System.out.println("链接：  "+connection);

    }

}
