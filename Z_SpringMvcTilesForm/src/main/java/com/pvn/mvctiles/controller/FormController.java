package com.pvn.mvctiles.controller;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pvn.mvctiles.model.Checkboxes;
import com.pvn.mvctiles.model.Person;
import com.pvn.mvctiles.model.Qualification;

@Controller
@SessionAttributes
public class FormController
{
	Logger OUT = LoggerFactory.getLogger(FormController.class);
	
	
	
	/**
	 * @param model
	 * @return
	 * static checkbox example
	 */
	@RequestMapping({"/checkbox", "/"})
	public String checkbox(Model model)
	{
		OUT.info("checkbox.jsp");
		Qualification command = new Qualification();
		command.setCompleted(true);
		command.setResult("Pass");
		command.setCourses(Arrays.asList("JAVA", "PHP", "MYSQL"));
		model.addAttribute("checkbox", command);
		return "checkbox";
	}
	
	@RequestMapping(value = "/checkboxSubmit.html", method = RequestMethod.POST)
	public String checkboxSubmit(@ModelAttribute("checkbox") Qualification checkbox, BindingResult result)
	{
		OUT.info("checkboxSubmit.html");
		checkbox.setCompleted(false);
		return "checkbox";
	}
	
	
	
	/**
	 * @param model
	 * @return
	 * Dynamic checkbox example(with 2 model attribute)
	 */
	@RequestMapping("/checkboxes")
	public String checkboxes(Model model)
	{
		OUT.info("AAAAA");
		Checkboxes checkboxes = new Checkboxes();
		checkboxes.setCourses(Arrays.asList("C", "Java", "HTML"));
		List<String> allCourses =  Arrays.asList("C", "C++", "HTML", "CSS", "Javascript", "Angular", "Mysql", "Java");
		model.addAttribute("allCourses", allCourses);
		model.addAttribute("checkboxes", checkboxes);
		return "checkboxes";
	}
	
	@RequestMapping(value = "/checkboxesSubmit.html", method = RequestMethod.POST)
	public String checkboxesSubmit(Model model, @ModelAttribute("checkboxes") Checkboxes checkboxes, BindingResult result)
	{
		OUT.info("checkboxSubmit.html");
		OUT.info("courses {}", checkboxes.getCourses());
		
		List<String> allCourses =  Arrays.asList("C", "C++", "HTML", "CSS", "Javascript", "Angular", "Mysql", "Java");
		model.addAttribute("allCourses", allCourses);
		
		return "checkboxes";
	}
	
	
	

	/**
	 * @param model
	 * @return
	 * Dynamic checkbox example(with only one model attribute)
	 */
	@RequestMapping("/checkboxes2")
	public String checkboxes2(Model model)
	{
		OUT.info("checkboxes2");
		Checkboxes checkboxes = new Checkboxes();
		checkboxes.setCourses(Arrays.asList("C", "Java", "HTML"));
		checkboxes.setAllCourses(Arrays.asList("C", "C++", "HTML", "CSS", "Javascript", "Angular", "Mysql", "Java"));
		model.addAttribute("checkboxes", checkboxes);
		return "checkboxes2";
	}

	@RequestMapping(value = "/checkboxes2Submit.html", method = RequestMethod.POST)
	public String checkboxes2Submit(Model model, @ModelAttribute("checkboxes") Checkboxes checkboxes, BindingResult result)
	{
		OUT.info("courses {}", checkboxes.getCourses());
		OUT.info("All courses {}", checkboxes.getAllCourses());
		
		List<String> allCourses =  Arrays.asList("C", "C++", "HTML", "CSS", "Javascript", "Angular", "Mysql", "Java");
		model.addAttribute("allCourses", allCourses);
		
		return "checkboxes2";
	}
	
	

	/**
	 * @param model
	 * @return
	 * static - radiobutton example
	 */
	@RequestMapping("/radiobutton")
	public String radiobutton(Model model)
	{
		OUT.info("radiobutton.jsp");
		Person person = new Person();
		person.setGender("Male");
		model.addAttribute("person", person);
		return "radiobutton";
	}
	
	@RequestMapping(value = "/radiobuttonSubmit.html", method = RequestMethod.POST)
	public String radiobuttonSubmit(Model model, @ModelAttribute("person") Person person, BindingResult result)
	{
		OUT.info("radiobuttonSubmit.html");
		person.setGender("Female");
		model.addAttribute("person", person);
		return "radiobutton";
	}

	
	/**
	 * @param model
	 * @return
	 * Dynamic - radiobuttons example
	 */
	@RequestMapping("/radiobuttons")
	public String radiobuttons(Model model)
	{
		OUT.info("radiobuttons.jsp");
		Person person = new Person();
		person.setAge("Above 40");
		model.addAttribute("person", person);
		return "radiobuttons";
	}
	
	@RequestMapping(value = "/radiobuttonsSubmit.html", method = RequestMethod.POST)
	public String radiobuttonsSubmit(Model model, @ModelAttribute("person") Person person, BindingResult result)
	{
		OUT.info("radiobuttonsSubmit.html");
		person.setAge("Above 50");
		model.addAttribute("person", person);
		return "radiobuttons";
	}
	
	
	/**
	 * @param model
	 * @return
	 * Dynamic - radiobuttons example
	 */
	@RequestMapping("/select")
	public String select(Model model)
	{
		OUT.info("select.jsp");
		Person person = new Person();
		person.setSelectedCountryList(Arrays.asList("Nepal"));
		model.addAttribute("person", person);
		return "select";
	}
	
	@RequestMapping(value = "/selectSubmit.html", method = RequestMethod.POST)
	public String selectSubmit(Model model, @ModelAttribute("person") Person person, BindingResult result)
	{
		OUT.info("selectSubmit.html");
		model.addAttribute("person", person);
		return "select";
	}
}
