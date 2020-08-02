package cn.jiyun.ssm.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "emp")
public class emp {
    @Id
    private Integer eid;
    private String ename;
    private Integer age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private Integer did;
    private String photo;
    private dept dept;

    @Override
    public String toString() {
        return "emp{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", did=" + did +
                ", photo='" + photo + '\'' +
                ", dept=" + dept +
                '}';
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public cn.jiyun.ssm.pojo.dept getDept() {
        return dept;
    }

    public void setDept(cn.jiyun.ssm.pojo.dept dept) {
        this.dept = dept;
    }
}
