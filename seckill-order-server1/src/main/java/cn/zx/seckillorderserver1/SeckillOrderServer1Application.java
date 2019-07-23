package cn.zx.seckillorderserver1;

import cn.zx.common.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "cn.zx.common.entity")
@EnableJpaRepositories(basePackages = "cn.zx.common.repository")
@SpringBootApplication
public class SeckillOrderServer1Application {

	public static void main(String[] args) {
		User user = new User();
		SpringApplication.run(SeckillOrderServer1Application.class, args);
	}

}
