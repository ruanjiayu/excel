package com.fun.uncle.excel;

import com.fun.uncle.excel.dao.DemoDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
class ExcelApplicationTests {

    @Autowired
    private DemoDAO demoDAO;

    @Test
    void contextLoads() {
    }


}
