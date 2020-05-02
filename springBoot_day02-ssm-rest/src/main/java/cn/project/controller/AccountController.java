package cn.project.controller;

import cn.project.domain.Account;
import cn.project.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 账户的控制器
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService accountService;

    @GetMapping("{id}")
    @ResponseBody
    public Account findById(@PathVariable("id") int id){//@PathVariable接收占位符的值，适用于Rest风格
        Account account = accountService.findById(id);
        return account;
    }


}
