package com.test.TestCFConfigServerConfig.restController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestRestController {
	
	@Value("test.string")
	protected String testString;
	
	public TestRestController() {
		super();
	}
	
	@RequestMapping(value="/getTestString",
						method=RequestMethod.GET,
						produces="text/plain")
	public String getTestString() {
		String result = null;
		
		if(this.testString != null) {
			result = this.testString;
		} else {
			result = "No config loaded";
		}
		
		return result;
	}

}
