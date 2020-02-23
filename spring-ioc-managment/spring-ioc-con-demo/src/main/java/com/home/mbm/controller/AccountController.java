package com.home.mbm.controller;

import com.home.mbm.mapper.IAccountMapper;
import com.home.mbm.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @Package: com.home.mbm.controller
* @ClassName: AccountController
* @Description: controller
 *      main：方法模拟
* @Author: mbm
* @date: 2020/2/12 20:19
* @Version: 1.0
*/
public class AccountController {

    public static void main(String[] args) {

        // 指定配置文件的路径
        ApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext.xml");

        // 读取配置文件，根据 bean 配置的ID 获取对象
        IAccountMapper accountMapper = (IAccountMapper) context.getBean("accountMapper");
        IAccountService accountService = (IAccountService) context.getBean("accountService");

        // 方法调用
        accountMapper.selectAll();
        accountService.selectAll();

    }

}
