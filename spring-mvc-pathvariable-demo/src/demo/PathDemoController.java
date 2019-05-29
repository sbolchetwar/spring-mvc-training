package demo;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("students")
public class PathDemoController {

	@RequestMapping("/{firstName}")
	public ModelAndView readFirstName(@PathVariable("firstName")String firstName) {

		
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","Student's first name is : "+firstName);

		return model;
	}
	
	/*@RequestMapping("/{firstName}/{lastName}")
	public ModelAndView readFirstAndLastName(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName) {

		
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","Student's first name is : "+firstName+ " and last name is : "+lastName);

		return model;
	}*/
	
/*	@RequestMapping("/address/{cityName}/{countryName}")
	public ModelAndView helloWorld(@PathVariable Map<String,String> pathVars) {

		String name = pathVars.get("cityName");
		String country = pathVars.get("countryName");

		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","students city is : "+name+ " country : "+country);

		return model;
	}*/
}