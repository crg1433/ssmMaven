package com.chen.dao;

import com.chen.po.Ssm;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SsmDao {

    @Insert("insert into ssm(name) value(#{name}) ")
    Integer insertSsm(Ssm ssm);

    @Select("select * from ssm")
    List<Ssm> selectAll();

}
