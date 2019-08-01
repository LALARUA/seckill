package cn.zx.seckillorderserver1;

import cn.zx.common.entity.User;
import cn.zx.common.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SeckillOrderServer1ApplicationTests {
	@Autowired
	private UserMapper userMapper;

	@Test
	public void contextLoads() {
		List<User> users = userMapper.selectAll();
		System.out.println(1);


	}

}
