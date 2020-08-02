package cn.jiyun.ssm.mapper;

import cn.jiyun.ssm.pojo.emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmpMapper {
    void addEmp(@Param(value="emp")emp emp);

    List<emp> findAll();

    void delete(Integer eid);


    emp findById(Integer eid);

    void update(@Param(value="emp")emp emp);
}
