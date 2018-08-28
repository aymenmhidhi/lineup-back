package adaming.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import adaming.com.domain.Site;
import adaming.com.feign.CommandService;

public class SiteController {
	@Autowired
	CommandService commandService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createSite(Site site) {
		return commandService.createSite(site);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public String updateSite(Site site) {
		return commandService.updateSite(site);
	}

	@RequestMapping(value = "/update", method = RequestMethod.DELETE)
	public String removeSite(String id) {
		return commandService.removeSite(id);
	}

}
