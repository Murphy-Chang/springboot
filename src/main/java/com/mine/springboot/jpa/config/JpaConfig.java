package com.mine.springboot.jpa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c) 2018
 *
 * @author Murphy.Chang
 * @version 1.0
 * @date 2018/6/12
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.mine.springboot.jpa.repository")
public class JpaConfig {
}
