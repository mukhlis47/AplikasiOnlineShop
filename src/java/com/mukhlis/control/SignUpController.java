/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mukhlis.control;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/SignUp")
public class SignUpController {
    @RequestMapping()
    public String SignUpForm(Model model) {
        SignUpFormBean SignUpBean = new SignUpFormBean();
        //registerBean.setLastName("Smith");
        model.addAttribute("SignUpBean", SignUpBean);
        return "SignUp";
    }

    @RequestMapping(value = "/save")
    public String saveSignUp(@ModelAttribute("SignUpBean") SignUpFormBean SignUpBean, Model model) {
        System.out.println("User Firstname: " + SignUpBean.getFirstName());
        model.addAttribute("data", SignUpBean);
        return "successregistration";
    }

    
}
