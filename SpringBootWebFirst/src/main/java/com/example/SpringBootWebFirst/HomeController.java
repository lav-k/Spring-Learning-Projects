package com.example.SpringBootWebFirst;

import org.springframework.ui.Model;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Home method called!");
        return "index";
    }

    @RequestMapping("add")
//    Servlet way of working with the inputs
//    public String add(HttpServletRequest req, HttpSession session){
//
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1+num2;
//        session.setAttribute("result",result);
//        System.out.println(result);
//        return "result.jsp";
//    }

//    Spring Boot way
//    public String add(@RequestParam("num1") int num1,@RequestParam("num2") int num2, Model model){
//
//        int result = num1+num2;
//        model.addObject("result", result);
//        System.out.println(result);
//        return "result.jsp";
//    }

    public ModelAndView add(@RequestParam("num1") int num1,@RequestParam("num2") int num2, ModelAndView mv){

        int result = num1+num2;
        mv.addObject("result", result);
        mv.setViewName("result");
//        System.out.println(result);
        return mv;
    }

//    @RequestMapping("addAlien")
//    public ModelAndView addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv){
////    public String addAlien(Alien alien, ModelAndView mv)
//
//        Alien alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//        mv.addObject("alien", alien);
//        mv.setViewName("result");
//        return mv;
//    }

//    @RequestMapping("addAlien")
//    public ModelAndView addAlien(Alien alien, ModelAndView mv){
////        alien.setAid(aid);
////        alien.setAname(aname);
//        mv.addObject("alien", alien);
//        mv.setViewName("result");
//        return mv;
//    }

//    @RequestMapping("addAlien")
//    public String addAlien(@ModelAttribute Alien alien){
//        return "result";
//    }

//  We can implement model attribute on methods as well
    @ModelAttribute("course")
    public String courseName()
    {
        return "Java";
    }

    @RequestMapping("addAlien")
    public String addAlien(Alien alien){
        return "result";
    }
}
