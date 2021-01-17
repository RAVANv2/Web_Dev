package com.harsh.springbootmvc;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage()
    {
        System.out.println("Home Page is Running");
        return "index";
    }

//    This Function takes the request comming from frontend and returns the result in jsp form
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
//        Model and View class is responsible for returning your jsp file with some data
        ModelAndView mv = new ModelAndView();
//        Add prefix and suffix in appication.properties for adding path of jsp file
        mv.setViewName("result");

        int num3 = num1 + num2;
        mv.addObject("num3",num3);
        return mv;
    }


//    This Function also does same thing but have different syntax
    /*
    @RequestMapping("add")
    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model m){
        int num3 = num1 + num2;
        m.addAttribute("num3",num3);
        return "result";
    }
     */

    // Complex way to write function and Efficient as well
    @PostMapping(value="addAlien")
    public String addAlien(@ModelAttribute("alien") Alien a){
        return "alien";
    }

    // Simple way but not satisfying coding standard

    /*
    @RequestMapping(value="addAlien",method = RequestMethod.POST)
    public String addAlien(@RequestParam("id") int id, @RequestParam("name") String name, HttpSession session){
        Alien a = new Alien();
        a.setId(id);
        a.setName(name);

        session.setAttribute("alien",a);
        return "alien";
    }
     */

}
