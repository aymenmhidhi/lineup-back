package adaming.com.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import adaming.com.domain.Site;

@FeignClient("LINE-UP-COMMAND")
public interface CommandService {

	@RequestMapping(method = RequestMethod.GET, value = "/api/command/site")
	String hello();

	@RequestMapping(method = RequestMethod.POST, value = "/api/command/site")
	String createSite(Site site);

	@RequestMapping(method = RequestMethod.PUT, value = "/api/command/site")
	String updateSite(Site site);

	@RequestMapping(method = RequestMethod.DELETE, value = "/api/command/site")
	String removeSite(String id);

}
