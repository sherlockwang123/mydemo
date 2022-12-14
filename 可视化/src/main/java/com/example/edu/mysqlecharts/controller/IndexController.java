package com.example.edu.mysqlecharts.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */
@Controller
public class IndexController {

 @RequestMapping("/")
 public String getIndex(){
     return "index";
 }

 @RequestMapping("/welcome")
 public String getWelcome(){
     return "web/welcome";
 }


}
