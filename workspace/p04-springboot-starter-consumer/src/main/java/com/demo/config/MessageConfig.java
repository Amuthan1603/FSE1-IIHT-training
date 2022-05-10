package com.demo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.api.MessageConvertor;
import com.demo.api.TamilConvertor;

@Configuration
public class MessageConfig {

	@Bean
	@ConditionalOnBean
	public MessageConvertor messageConvertor() {
		return new TamilConvertor();
	}
	
}
