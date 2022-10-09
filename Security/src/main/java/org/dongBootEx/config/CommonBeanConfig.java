package org.dongBootEx.config;

import org.dongBootEx.util.JwtTokenUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonBeanConfig {

    /**
     * 配置jwt token
     */
    @Bean
    public JwtTokenUtil configToken() {
        return new JwtTokenUtil();
    }
}