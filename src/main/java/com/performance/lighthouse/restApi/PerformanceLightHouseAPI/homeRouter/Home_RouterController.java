package com.performance.lighthouse.restApi.PerformanceLightHouseAPI.homeRouter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home_RouterController {

	@GetMapping("/api/ver1/Home")
	public String getHomeView(Model model) {
		model.addAttribute("hello", "hello");
		return "ApiHome";
	}
	
}
