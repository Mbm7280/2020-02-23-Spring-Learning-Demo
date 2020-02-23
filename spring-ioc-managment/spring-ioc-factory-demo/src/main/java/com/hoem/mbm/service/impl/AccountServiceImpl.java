package com.hoem.mbm.service.impl;

import com.hoem.mbm.mapper.IAccountMapper;
import com.hoem.mbm.service.IAccountService;

import java.util.List;

/**
* @Package: com.home.mbm.service.impl
* @ClassName: AccountServiceImpl
* @Description: service 接口实现类
* @Author: mbm
* @date: 2020/2/12 20:16
* @Version: 1.0
*/
public class AccountServiceImpl implements IAccountService {

    // IAccountMapper 引入
    private IAccountMapper accountMapper;

    // 方法重写
    @Override
    public List selectAll() {
        // 模拟 service 方法执行
        System.out.println("AccountServiceImpl-selectAll");
        return null;
    }
}
