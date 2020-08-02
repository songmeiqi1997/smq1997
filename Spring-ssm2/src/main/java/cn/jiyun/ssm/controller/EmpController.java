package cn.jiyun.ssm.controller;

import cn.jiyun.ssm.pojo.dept;
import cn.jiyun.ssm.pojo.emp;
import cn.jiyun.ssm.service.DeptService;
import cn.jiyun.ssm.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @Autowired
    private DeptService deptService;


    @Value("${file.upload.path}")
  private  String filePath;
  @PostMapping("addEmp")
    public String addEmp(@ModelAttribute(value = "emp") emp emp,@RequestParam(value = "file")MultipartFile file){
     String fileName=file.getOriginalFilename();
    File photoFile= new File(filePath,fileName);
    //判断当前系统是否存在上传路径,如果不存在就创建
    if(!photoFile.getParentFile().exists()){
        photoFile.getParentFile().mkdirs();
    }
        try {
            file.transferTo(new File(filePath+File.separator+fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        emp.setPhoto("/photo/"+fileName);
        empService.addEmp(emp);
        //跳转到展示页面
        return "redirect:/emp/findAll";
    }
    @GetMapping("findAll")
    public String findAll(Model model){
        List<emp>emp=empService.findAll();
        model.addAttribute("emp",emp);
        return "empList";
    }
    @GetMapping("delete")
    public String delete(Integer eid){
        empService.delete(eid);
        return "redirect:/emp/findAll";
    }

    @GetMapping("findById")
    public String findById(Integer eid,Model model){
        List<dept> dept= deptService.findDept();
        model.addAttribute("dept",dept);
        emp emp=empService.findById(eid);
        model.addAttribute("emp",emp);
        return "update";
    }

    @PostMapping("update")
    public String update(emp emp){

        empService.update(emp);
        return "redirect:/emp/findAll";
    }
}
