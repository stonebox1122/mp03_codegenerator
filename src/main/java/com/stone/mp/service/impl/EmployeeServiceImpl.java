package com.stone.mp.service.impl;

import com.stone.mp.beans.Employee;
import com.stone.mp.mapper.EmployeeMapper;
import com.stone.mp.service.EmployeeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author stone
 * @since 2018-12-24
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
/**
 * EmployeeServiceImpl继承了ServiceImpl
 * 1。在ServiceImpl中已经完成了Mapper对象的注入，可以直接在EmployeeServiceImpl中进行使用
 * 2.在ServiceImpl中也提供了常用了CRUD方法，基本的一些CRUD方法在Service中不需要自定义了
 */
}
