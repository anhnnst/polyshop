package edu.poly.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller class for User domain
 * Author: Nguyen Ngoc Anh - anhnnst@yahoo.com
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginGet(){
        return "administrator/users/login";
    }

//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String loginGet(){
//
//    }
}
