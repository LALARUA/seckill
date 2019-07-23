package cn.zx.common.repository;

import cn.zx.common.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 21:50 2019/7/22 0022
 */
public interface UserRepository extends JpaRepository<User,String>{

}
