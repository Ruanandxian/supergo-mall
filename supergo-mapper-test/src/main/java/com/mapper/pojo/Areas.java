package com.mapper.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "tb_areas")
public class Areas implements Serializable {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "areaid")
    private String areaid;
    @Column(name = "area")
    private String area;
    @Column(name = "cityid")
    private String cityid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    @Override
    public String toString() {
        return "Areas{" +
                "id=" + id +
                ", areaid='" + areaid + '\'' +
                ", area='" + area + '\'' +
                ", cityid='" + cityid + '\'' +
                '}';
    }
}