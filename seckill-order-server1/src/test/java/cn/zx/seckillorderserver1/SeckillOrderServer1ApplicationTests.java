package cn.zx.seckillorderserver1;

import cn.zx.common.entity.User;
import cn.zx.common.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SeckillOrderServer1ApplicationTests {
	@Autowired
	private UserRepository userDao;

	@Test
	public void contextLoads() {
		User user = new User();
		user.setUsername("zhongxiang");
		user.setPassword("123456");
		userDao.save(user);


	}

}
