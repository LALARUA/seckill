package cn.zx.common.mapper;

import cn.zx.common.entity.TbPermission;
import cn.zx.tk.mybatis.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPermissionMapper extends MyMapper<TbPermission> {

    List<TbPermission> selectByUserId(@Param("userId") Long userId);
}
