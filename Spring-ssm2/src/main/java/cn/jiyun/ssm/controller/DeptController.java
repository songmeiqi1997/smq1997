package cn.jiyun.ssm.controller;

import cn.jiyun.ssm.pojo.dept;
import cn.jiyun.ssm.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("toAdd")
    public String add(Model model){
        List<dept> dept= deptService.findDept();
       model.addAttribute("dept",dept);
        System.out.println("dept"+dept.toString());
        return "add";
    }
}
