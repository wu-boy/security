package com.wu.security.security.test;

import com.wu.security.security.api.pojo.entity.Department;
import com.wu.security.security.impl.SecurityApplication;
import com.wu.security.security.impl.service.DepartmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Service测试
 * @author wusq
 * @date 2019/4/26
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SecurityApplication.class)
public class ServiceTest {

    @Autowired
    private DepartmentService service;

    @Test
    public void contextLoads() {
    }

    @Test
    public void test() throws Exception {
        Department o = new Department();
        o.setName("XX公司");
        o.setId("04803b5048d143d59a95a8642c0b06d5");
        o.setParentId("04803b5048d143d59a95a8642c0b06d5");
        service.insert(o);
    }

}
