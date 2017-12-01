package com.boot.ssm.service;

import com.boot.ssm.core.BaseMapper;
import com.boot.ssm.core.BaseService;
import com.boot.ssm.dao.CustomerMapper;
import com.boot.ssm.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends BaseService<Customer>{
    @Autowired
    public CustomerMapper customerMapper;

    @Override
    protected BaseMapper<Customer> getDao() {
        return customerMapper;
    }
}
