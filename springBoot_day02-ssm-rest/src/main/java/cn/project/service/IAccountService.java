package cn.project.service;

import cn.project.domain.Account;

import java.util.List;

public interface IAccountService {

    /**
     * 根据id查询
     */
    public Account findById(int id);

}
