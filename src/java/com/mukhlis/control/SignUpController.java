/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mukhlis.control;

import com.mukhlis.Dao.CustomerService;
import com.mukhlis.entity.Tablecustomers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signup")
public class SignUpController {

    @Autowired
    CustomerService cs;

    @RequestMapping()
    public String SignUpForm(Model model) {
        SignUpFormBean SignUpBean = new SignUpFormBean();
        //registerBean.setLastName("Smith");
        model.addAttribute("SignUpBean", SignUpBean);
        return "SignUp";
    }

    @RequestMapping(value = "/save")
    public String saveRegistration(@ModelAttribute("SignUpBean") SignUpFormBean SignUpBean,
            Model model) {
        Tablecustomers customer = new Tablecustomers();
        customer.setNamalengkap(SignUpBean.getNamaLengkap());
        customer.setAddress(SignUpBean.getAlamat());
        customer.setEmail(SignUpBean.getEmail());
        customer.setPhone(SignUpBean.getPhone());
        customer.setUsername(SignUpBean.getUsername());
        customer.setPassword(SignUpBean.getPassword());
        cs.addCustomer(customer);
        model.addAttribute("data", SignUpBean);
        return "SignUpberhasil";

    }
}
