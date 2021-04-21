package org.example.eureka.configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author chenli
 * @version V1.0
 * @Company: 上海浦东华宇信息技术有限公司
 * @Title: HttpBaseConfiguration
 * @Package org.example.eurakaService.configuration
 * @Description:
 * @date 2021/4/21 21:43
 */
@EnableWebSecurity
public class HttpBaseConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable().httpBasic();
        super.configure(http);
    }
}
