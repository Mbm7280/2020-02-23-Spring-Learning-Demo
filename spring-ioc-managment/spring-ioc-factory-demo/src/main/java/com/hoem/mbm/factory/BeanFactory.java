package com.hoem.mbm.factory;

import com.hoem.mbm.mapper.IAccountMapper;
import com.hoem.mbm.mapper.impl.AccountMapperImpl;
import com.hoem.mbm.service.IAccountService;
import com.hoem.mbm.service.impl.AccountServiceImpl;

/**
* @Package: com.hoem.mbm.factory
* @ClassName: BeanFactory
* @Description: factory：bean 的创建工厂
* @Author: mbm
* @date: 2020/2/12 21:09
* @Version: 1.0
*/
public class BeanFactory {

    // 创建 IAccountMapper 对象
    public IAccountMapper getMapper(){
        return new AccountMapperImpl();
    }

    // 创建 IAccountService 对象
    public IAccountService getService(){
        return new AccountServiceImpl();
    }

}
