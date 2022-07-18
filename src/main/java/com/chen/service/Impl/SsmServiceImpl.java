package com.chen.service.Impl;

import com.chen.dao.SsmDao;
import com.chen.po.Ssm;
import com.chen.service.SsmService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ssmService")
public class SsmServiceImpl implements SsmService {
    @Resource
    private SsmDao ssmDao;
    @Override
    public List<Ssm> findAll() {
        System.out.println("服务层运行。。。");
        return ssmDao.selectAll();
    }
}
