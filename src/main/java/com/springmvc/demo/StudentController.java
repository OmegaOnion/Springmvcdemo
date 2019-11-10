package com.springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

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
    public String processForm(@Valid @ModelAttribute("student") Student myStudent, BindingResult result){
        if(result.hasErrors()){
            return "student-form";
        } else {
            return "student-confirmation";
        }
    }

}
