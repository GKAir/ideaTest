package cn.crm.mapper.ext;


import cn.crm.pojo.Customer;
import cn.crm.pojo.ext.CustomerQueryVo;

import java.util.List;

public interface CustomerExtMapper {
	List<Customer> queryCustomerList(CustomerQueryVo vo);

	int queryCustomerCount(CustomerQueryVo vo);
}