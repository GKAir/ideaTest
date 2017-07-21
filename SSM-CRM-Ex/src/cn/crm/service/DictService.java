package cn.crm.service;

import cn.crm.pojo.BaseDict;

import java.util.List;

/**
 * Create by Air on 2017-07-15 at 17:30
 */
public interface DictService {

    List<BaseDict> findByDictTypeCode(String typeCode);

}
