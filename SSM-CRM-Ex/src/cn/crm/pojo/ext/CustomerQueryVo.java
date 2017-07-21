package cn.crm.pojo.ext;

import cn.crm.pojo.Customer;

/**
 * Create by Air on 2017-07-15 at 17:48
 */
public class CustomerQueryVo {

    private Customer customer;
    // 分页信息
    private Integer page = 1;

    private Integer rows = 20;

    private Integer start = 1;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}
