package com.wu.security.security.impl.dao;

import com.wu.security.security.api.pojo.entity.Department;
import org.apache.ibatis.annotations.Mapper;

/**
 * 部门
 * @author wusq
 * @date 2019/4/26
 */
@Mapper
public interface DepartmentMapper {

    void insert(Department department);
}
