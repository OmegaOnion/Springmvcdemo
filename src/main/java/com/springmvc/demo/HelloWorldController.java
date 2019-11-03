package com.springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("/processFormV2")
    public String letsShoutDude(HttpServletRequest request, Model model){

        // read the request parameter
        String name = request.getParameter("studentName");
        // change to upper case to SHOUT!
        name = name.toUpperCase();
        // create the message
        String result  = "YO! " + name;
        // add message to the mode
        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/processFormV3")
    public String letsShoutDudeV2(@RequestParam("studentName") String name, Model model){

        // change to upper case to SHOUT!
        name = name.toUpperCase();
        // create the message
        String result  = "HEY MAN! " + name;
        // add message to the mode
        model.addAttribute("message", result);

        return "helloworld";
    }




}
