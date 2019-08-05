package cn.zx.authenticate.service;

import cn.zx.common.entity.TbPermission;

import java.util.List;

public interface TbPermissionService {
    List<TbPermission> getByUserId(Long userId);
}
