package cn.zx.authenticate.service.impl;

import cn.zx.authenticate.service.TbPermissionService;
import cn.zx.common.entity.TbPermission;
import cn.zx.common.mapper.TbPermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbPermissionImpl implements TbPermissionService {
    @Autowired
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> getByUserId(Long userId) {
        List<TbPermission> tbPermissions = tbPermissionMapper.selectByUserId(userId);
        return tbPermissions;
    }
}
