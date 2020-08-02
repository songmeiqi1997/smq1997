package cn.jiyun.ssm.mapper;

import cn.jiyun.ssm.pojo.dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
    List<dept> findDept();
}
