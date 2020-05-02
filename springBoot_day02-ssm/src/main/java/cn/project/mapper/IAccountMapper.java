package cn.project.mapper;

import cn.project.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
//@Mapper标记该类是一个mybatis的mapper接口，可以被spring boot自动扫描到spring上下文中
public interface IAccountMapper {

    public List<Account> findAll();

    public void deleteById(int id);

    public Account findById(int id);
}

