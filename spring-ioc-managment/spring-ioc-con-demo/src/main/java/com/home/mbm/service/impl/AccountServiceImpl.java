package com.home.mbm.service.impl;

import com.home.mbm.mapper.IAccountMapper;
import com.home.mbm.service.IAccountService;

import java.util.List;

/**
* @Package: com.home.mbm.service.impl
* @ClassName: AccountServiceImpl
* @Description: service 接口 实现类
* @Author: mbm
* @date: 2020/2/12 20:16
* @Version: 1.0
*/
public class AccountServiceImpl implements IAccountService {

    // IAccountMapper 引入, 此次并没有 直接new, 而是 由 Spring-Ioc 负责创建和注入。
    private IAccountMapper accountMapper;

    // 如果自定义含参构造，抵消 默认的无参构造 ，则 依赖于 无参构造的 创建Bean的方式则失败。
   /* public AccountServiceImpl(IAccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }*/

    // 方法重写
    @Override
    public List selectAll() {
        // 模拟 service 方法执行
        System.out.println("AccountServiceImpl-selectAll");
        return null;
    }
}
