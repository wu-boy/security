package com.wu.security.security.impl.service;

import com.wu.security.parker.random.RandomUtils;
import com.wu.security.security.api.pojo.entity.Department;
import com.wu.security.security.impl.dao.DepartmentMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 部门
 * @author wusq
 * @date 2019/4/26
 */
@Service
@Transactional
public class DepartmentService {

    @Autowired
    private DepartmentMapper mapper;

    public void insert(Department department){
        if(department != null){
            if(StringUtils.isBlank(department.getId())){
                department.setId(RandomUtils.uuidWithoutBar());
            }
            mapper.insert(department);
        }
    }
}
