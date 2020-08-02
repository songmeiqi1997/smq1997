package cn.jiyun.ssm.service;

import cn.jiyun.ssm.mapper.EmpMapper;
import cn.jiyun.ssm.pojo.emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmpService {
    @Autowired
    private EmpMapper empMapper;
    public  void addEmp(emp emp){
        empMapper.addEmp(emp);
    }
    public List<emp> findAll(){
        return empMapper.findAll();
    }
    public void delete(Integer eid){
        empMapper.delete(eid);
    }


    public emp findById(Integer eid) {
           return  empMapper.findById(eid);
    }

    public void update(emp emp) {
        empMapper.update(emp);
    }
}
