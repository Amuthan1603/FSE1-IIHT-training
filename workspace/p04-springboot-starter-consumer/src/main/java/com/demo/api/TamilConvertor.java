package com.demo.api;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class TamilConvertor implements MessageConvertor {

	@Override
	public void translate(String message) {
		System.out.println("This message is in Tamil: "+message);
	}

}
