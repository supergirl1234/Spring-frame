package com.lei.controller;



import com.lei.entity.Student;
import com.lei.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/index")
public class IndexHandler {

    @GetMapping("/index")
    public  String index(Model model){

      /*  System.out.println("index....");*/
        List<Student> list=new ArrayList<>();
        list.add(new Student(1,"张三",11));
        list.add(new Student(2,"李四",12));
        list.add(new Student(3,"王五",13));
        model.addAttribute("list",list);

        return "index";
    }

    @GetMapping("/index2")
    public  String index2(Map<String,String> map){

        map.put("name","张三");
        return  "index";
    }


    @GetMapping("/index3")
    public  String index3(Map<String,Boolean> map){
        map.put("flag",true);
        return  "index";
    }

    @GetMapping("/test")
    public  String test(Model model){

        model.addAttribute("name","tom");
        return  "test";
    }

    @GetMapping("/url/{name}")
    @ResponseBody
    public  String url(@PathVariable("name") String name){

        return  name;
    }

    @GetMapping("/src")
    public  String src(Model model){

        model.addAttribute("src","https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1573815979&di=1fae32c7aea863ebbd2dd8e429d14a6d&src=http://img0.pchouse.com.cn/pchouse/1807/30/2282515_20180730160946.png");
        return  "test";
    }


    @GetMapping("/eq")
    public  String eq(Model model){
        model.addAttribute("age",30);
        return "test";

    }

    @GetMapping("/switch")
    public  String switchTest(Model model){
        model.addAttribute("gender","男");
        return "test";

    }

    @GetMapping("/object")
    public String object(HttpServletRequest request){
        request.setAttribute("request","request对象");
        request.getSession().setAttribute("session","session对象");
        return  "test";
    }


    @GetMapping("/util")
    public String util(Model model){

        model.addAttribute("name","张三");
        model.addAttribute("users",new ArrayList<>());
        model.addAttribute("counts","22");
        model.addAttribute("date",new Date());
        return "test";
    }

    @GetMapping("/validator")
    public void validatorUser(@Valid User user, BindingResult bindingResult){

        System.out.println(user);
        if(bindingResult.hasErrors()){
            List<ObjectError> list=bindingResult.getAllErrors();
            for(ObjectError objectError:list){

                System.out.println(objectError.getCode()+"-"+objectError.getDefaultMessage());
            }

        }
    }
}
