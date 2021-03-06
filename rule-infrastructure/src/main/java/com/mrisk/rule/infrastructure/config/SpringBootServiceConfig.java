package com.mrisk.rule.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mrisk.rule.application.repository.RuleRepository;
import com.mrisk.rule.application.service.RuleService;

@Configuration
public class SpringBootServiceConfig {


  @Bean
  public RuleService ruleService(RuleRepository userRepository) {
    return new RuleService(userRepository);
  }
  
}