package com.home.mbm.factory;

import com.home.mbm.mapper.IAccountMapper;
import com.home.mbm.mapper.impl.AccountMapperImpl;
import com.home.mbm.service.IAccountService;
import com.home.mbm.service.impl.AccountServiceImpl;

/**
* @Package: com.hoem.mbm.factory
* @ClassName: BeanFactory
* @Description: factory
* @Author: mbm
* @date: 2020/2/12 21:09
* @Version: 1.0
*/
public class BeanFactory {

    // 创建 IAccountMapper 对象
    public static IAccountMapper getMapper(){
        return new AccountMapperImpl();
    }

    // 创建 IAccountService 对象
    public static IAccountService getService(){
        return new AccountServiceImpl();
    }

}
