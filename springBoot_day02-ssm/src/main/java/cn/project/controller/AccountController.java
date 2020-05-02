package cn.project.controller;

import cn.project.domain.Account;
import cn.project.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService accountService;

    @RequestMapping("/findAll")
    @ResponseBody//表示该方法返回json数据
    public List<Account> findAll(){
        List<Account> accounts =accountService.findAll();
        return accounts;
    }

    @RequestMapping("/findById")
    @ResponseBody
    public Account findById(@RequestParam(value = "id") int id){//@RequestParam接收问号后面传过来的参数
        Account account = accountService.findById(id);
        return account;
    }

    @RequestMapping("/deleteById")
    @ResponseBody
    public String deleteById(@RequestParam(value = "id") int id){//@RequestParam接收问号后面传过来的参数
        accountService.deleteAccount(id);
        return "删除成功";
    }


    @RequestMapping("/queryAll")
    public String queryAll(Model model){
        List<Account> accounts =accountService.findAll();
        model.addAttribute("accounts",accounts);
        return "list";//返回list页面
    }

}
