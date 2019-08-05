package cn.zx.authenticate.service;

import cn.zx.common.entity.TbUser;

public interface TbUserService {
    TbUser getTbUserByName(String name);
}
