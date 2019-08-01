package cn.zx.tk.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 22:18 2019/8/1 0001
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
