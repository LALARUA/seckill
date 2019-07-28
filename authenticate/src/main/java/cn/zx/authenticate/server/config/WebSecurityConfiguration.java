package cn.zx.authenticate.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 22:17 2019/7/28 0028
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true,jsr250Enabled = true,securedEnabled = true)
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter{

    @Bean
    public PasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("zx").password(bCryptPasswordEncoder().encode("123456")).roles("ADMIN")
                .and()
                .withUser("qw").password(bCryptPasswordEncoder().encode("123456")).roles("USER");
    }
}
