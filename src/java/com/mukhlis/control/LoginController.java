/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mukhlis.control;

import com.mukhlis.Dao.CustomerService;
import com.mukhlis.entity.Tablecustomers;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    
    @Autowired
    CustomerService cs;
    
    @RequestMapping()
    public String loginForm(Model model) {
        LoginFormBean loginBean = new LoginFormBean();
        model.addAttribute("loginBean", loginBean);
        return "login";
}
    @RequestMapping(value = "/check")
    public String checkLogin(HttpSession session, @ModelAttribute("loginBean") LoginFormBean loginBean, Model model) {
        Tablecustomers customer = cs.findByUsername(loginBean.getUserName());
        if(customer.getUsername()== null) {
            model.addAttribute("errMsg", "Username salah");
            return "login";
        }
        
        session.setAttribute("user", customer);
        
        return "loginberhasil";
    }
}