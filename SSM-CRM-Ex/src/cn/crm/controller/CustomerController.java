package cn.crm.controller;

import cn.crm.pojo.BaseDict;
import cn.crm.pojo.Customer;
import cn.crm.pojo.ext.CustomerQueryVo;
import cn.crm.service.CustomerService;
import cn.crm.service.DictService;
import cn.crm.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Create by Air on 2017-07-15 at 16:55
 */
@RequestMapping("/customer")
@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private DictService dictService;

    @Value("${from_type}")
    private String from_type;

    @Value("${level_type}")
    private String level_type;

    @Value("${industry_type}")
    private String industry_type;

    @RequestMapping("/list")
    public String findAll(@RequestParam("id") CustomerQueryVo vo,Model model){

        List<BaseDict> fromTypeList = dictService.findByDictTypeCode(from_type);
        List<BaseDict> industryTypeList = dictService.findByDictTypeCode(industry_type);
        List<BaseDict> levelTypeList = dictService.findByDictTypeCode(level_type);

        model.addAttribute("fromType", fromTypeList);
        model.addAttribute("industryType", industryTypeList);
        model.addAttribute("levelType", levelTypeList);

        if (vo.getCustomer() != null) {
            model.addAttribute("custName", vo.getCustomer().getCustName());
            model.addAttribute("custSource", vo.getCustomer().getCustSource());
            model.addAttribute("custIndustry", vo.getCustomer().getCustIndustry());
            model.addAttribute("custLevel", vo.getCustomer().getCustLevel());
        }
        Page<Customer> page = customerService.queryCustomerByPage(vo);

        model.addAttribute("page", page);
        return "/customer";
    }
    @RequestMapping("/edit")
    @ResponseBody
    public String editCustomer(@RequestParam("id") Integer custId){



        return "/customer";
    }
}
