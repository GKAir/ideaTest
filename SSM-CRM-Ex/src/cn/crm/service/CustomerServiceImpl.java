package cn.crm.service;

import cn.crm.mapper.CustomerMapper;
import cn.crm.mapper.ext.CustomerExtMapper;
import cn.crm.pojo.Customer;
import cn.crm.pojo.ext.CustomerQueryVo;
import cn.crm.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Create by Air on 2017-07-15 at 17:10
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private CustomerExtMapper customerExtMapper;

    public Page<Customer> queryCustomerByPage(CustomerQueryVo vo){
        vo.setStart((vo.getPage() - 1) * vo.getRows());
        List<Customer> list = customerExtMapper.queryCustomerList(vo);
        int count = customerExtMapper.queryCustomerCount(vo);
        Page<Customer> page = new Page<>();
        page.setRows(list);
        page.setTotal(count);
        page.setPage(vo.getPage());
        page.setSize(vo.getRows());
        return page;
    }
}
