package cn.project.service;

import cn.project.domain.Account;

import java.util.List;

public interface IAccountService {
    /**
     *查询所有
     */
    public List<Account> findAll();

    /**
     * 根据id查询
     */
    public Account findById(int id);

    /**
     * 根据id删除
     */
    public void deleteAccount(int id);
}
