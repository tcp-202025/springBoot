package cn.project.service.impl;

import cn.project.domain.Account;
import cn.project.mapper.IAccountMapper;
import cn.project.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccountService implements IAccountService {

    @Autowired
    private IAccountMapper accountMapper;

    public List<Account> findAll() {
        return accountMapper.findAll();
    }

    @Override
    public Account findById(int id) {
        return accountMapper.findById(id);
    }

    @Override
    @Transactional//开启事务
    public void deleteAccount(int id) {
        accountMapper.deleteById(id);
    }
}
