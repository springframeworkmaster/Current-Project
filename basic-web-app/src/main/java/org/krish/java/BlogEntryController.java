package org.krish.java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogEntryController {
	@RequestMapping("/test")
	public String test()
	{
		return "view";
	}

}
