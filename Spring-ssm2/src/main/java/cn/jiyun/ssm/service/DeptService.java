package cn.jiyun.ssm.service;

import cn.jiyun.ssm.mapper.DeptMapper;
import cn.jiyun.ssm.pojo.dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class DeptService {
    @Autowired
    private DeptMapper deptMapper;



    public List<dept> findDept() {
        return deptMapper.findDept();
    }
}
