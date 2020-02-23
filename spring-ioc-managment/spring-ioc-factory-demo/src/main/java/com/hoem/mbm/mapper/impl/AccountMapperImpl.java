package com.hoem.mbm.mapper.impl;

import com.hoem.mbm.mapper.IAccountMapper;

import java.util.List;

/**
* @Package: com.home.mbm.mapper.impl
* @ClassName: AccountMapperImpl
* @Description: mapper impl
* @Author: mbm
* @date: 2020/2/12 20:16
* @Version: 1.0
*/
public class AccountMapperImpl implements IAccountMapper {

    // 方法重写
    @Override
    public List selectAll() {
        // 模拟 mapper 方法执行
        System.out.println("AccountMapperImpl-selectAll");
        return null;
    }
}
