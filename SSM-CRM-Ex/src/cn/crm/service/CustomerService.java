package cn.crm.service;

import cn.crm.pojo.Customer;
import cn.crm.pojo.ext.CustomerQueryVo;
import cn.crm.utils.Page;

/**
 * Create by Air on 2017-07-15 at 17:09
 */
public interface CustomerService {
    Page<Customer> queryCustomerByPage(CustomerQueryVo vo);
}
