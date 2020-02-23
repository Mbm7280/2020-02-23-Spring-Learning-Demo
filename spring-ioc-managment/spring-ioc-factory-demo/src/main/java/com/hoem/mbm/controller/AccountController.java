package com.hoem.mbm.controller;

import com.hoem.mbm.mapper.IAccountMapper;
import com.hoem.mbm.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @Package: com.hoem.mbm.controller
* @ClassName: AccountMapper
* @Description: controller
 *      main：模拟
* @Author: mbm
* @date: 2020/2/12 21:10
* @Version: 1.0
*/
public class AccountController {

    public static void main(String[] args) {

        // 指定配置文件路径
        ApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext.xml");

        // 创建 IAccountMapper
        IAccountMapper accountMapper = (IAccountMapper) context.getBean("accountMapper");

        // 创建 IAccountService
        IAccountService accountService = (IAccountService) context.getBean("accountService");

        // 方法调用
        accountMapper.selectAll();
        accountService.selectAll();


    }

}
