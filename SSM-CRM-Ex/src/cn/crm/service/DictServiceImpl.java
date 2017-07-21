package cn.crm.service;

import cn.crm.mapper.BaseDictMapper;
import cn.crm.pojo.BaseDict;
import cn.crm.pojo.BaseDictExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Create by Air on 2017-07-15 at 17:30
 */
@Service
@Transactional
public class DictServiceImpl implements DictService {

    @Autowired
    private BaseDictMapper dictMapper;

    @Override
    public List<BaseDict> findByDictTypeCode(String typeCode) {
        BaseDictExample baseDictExample = new BaseDictExample();
        BaseDictExample.Criteria criteria = baseDictExample.createCriteria();
        criteria.andDictTypeCodeEqualTo(typeCode);
        return dictMapper.selectByExample(baseDictExample);
    }
}
