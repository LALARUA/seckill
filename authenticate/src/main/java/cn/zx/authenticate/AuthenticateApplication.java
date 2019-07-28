package cn.zx.authenticate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "cn.zx.common.entity")
@EnableJpaRepositories(basePackages = "cn.zx.common.repository")
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class AuthenticateApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticateApplication.class, args);
	}

}
