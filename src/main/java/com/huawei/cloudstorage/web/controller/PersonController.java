package com.huawei.cloudstorage.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huawei.cloudstorage.dal.modelDo.Person;
import com.huawei.cloudstorage.service.PersonService;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 * 
 */
@Controller
@RequestMapping("/personController")
public class PersonController extends BaseController {
	private static Logger logger = Logger.getLogger(PersonController.class);
	@Autowired
    private PersonService personService;
    
    public PersonService getPersonService() {
        return personService;
    }

    //@Autowired
//    public void setPersonService(IPersonService personService) {
//        this.personService = personService;
//    }

    @RequestMapping("/showPerson.htm")
    public String showPersons(ModelMap model){
        List<Person> persons = personService.loadPersons();
        model.addAttribute("persons", persons);
        logger.info("-------------------------------------------");
        return "showperson.jsp";
    }
    @RequestMapping("/test.json")
    @ResponseBody
    public Map<String,Object> test(ModelMap model, HttpServletResponse response){
        List<Person> persons = personService.loadPersons();
        Map<String,Object> map = new HashMap<>();
        map.put("persons", persons);
        model.addAttribute("persons", persons);
        logger.info("日志打印测试！");
        logger.error("日志打印测试！");
        return map;
    }
}