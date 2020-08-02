package cn.jiyun.ssm.pojo;

import javax.persistence.Table;

@Table(name = "dept")
public class dept {
    private Integer did;
    private String dname;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
