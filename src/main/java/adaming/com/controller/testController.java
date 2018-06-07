package adaming.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import adaming.com.feign.CommandService;

@RestController
@RequestMapping("/api")

public class testController {
	@Autowired
	CommandService commandService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return commandService.hello();
	}

}
