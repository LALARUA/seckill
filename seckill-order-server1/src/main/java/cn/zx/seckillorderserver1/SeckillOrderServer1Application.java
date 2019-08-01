package cn.zx.seckillorderserver1;

import cn.zx.common.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import tk.mybatis.spring.annotation.MapperScan;


@MapperScan(basePackages = "cn.zx.common.mapper")
@SpringBootApplication
public class SeckillOrderServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(SeckillOrderServer1Application.class, args);
	}

}
