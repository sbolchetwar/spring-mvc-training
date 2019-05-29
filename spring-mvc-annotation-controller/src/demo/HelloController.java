package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/multiaction")
public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","This is annotation based handler mapping controller example");

		return model;
	}
	
	/*@RequestMapping("/method2")
	public ModelAndView methodTwo() {

		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","This is to demo multi action controller");

		return model;
	}*/

}
