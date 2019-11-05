package com.springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model myModel){

        // create student object
        Student myStudent = new Student();
        // add student object to model
        myModel.addAttribute("student",myStudent);

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student myStudent){

        System.out.println("myStudent: " + myStudent.getFirstName() + " " + myStudent.getLastName());
        return "student-confirmation";
    }

}
