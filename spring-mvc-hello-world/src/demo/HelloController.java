package demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
 
public class HelloController extends AbstractController{
 
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
 
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "Welcome Spring MVC Application - This is Bean Name Url Handler Mapping example");
		
		return modelandview;
	}
}
