package com.zensar.messageApi.actuator.endpoint;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="zesnsarendpoint")
public class CustomerActuatorEndpoint {

	@ReadOperation									//This is map to get HTTP Method
													//You also have @WriteOPeration method for http post method 
	public Map<String, String> customerEndpoint() {
		Map<String, String> param=new HashMap<String,String>();
		param.put("name","zensar");
		return param;
	}
}
