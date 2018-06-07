package adaming.com.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("LINE-UP-COMMAND")
public interface CommandService {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/command/hello")	
	String hello();

}
