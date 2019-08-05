package cn.zx.authenticate.service.impl;

import cn.zx.authenticate.service.TbUserService;
import cn.zx.common.entity.TbUser;
import cn.zx.common.mapper.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class TbUserServiceImpl implements TbUserService {


    @Autowired
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getTbUserByName(String name) {
        Example example = new Example(TbUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username",name);
        tbUserMapper.selectOneByExample(example);
        return null;
    }
}
