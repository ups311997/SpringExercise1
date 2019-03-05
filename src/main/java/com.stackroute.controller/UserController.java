package com.stackroute.controller;

import com.stackroute.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @RequestMapping("display")
    public  ModelAndView display(HttpServletRequest request)
    {
        String str1= request.getParameter("t1");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("username",str1);
        return  mv;
    }
}
