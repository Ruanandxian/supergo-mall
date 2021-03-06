package com.supergo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@ApiModel(value="com.supergo.pojo.Areas")
@Table(name = "tb_areas")
public class Areas implements Serializable {
    /**
     * 唯一ID
     */
    @Id
    @ApiModelProperty(value="id唯一ID")
    private Integer id;

    /**
     * 区域ID
     */
    @ApiModelProperty(value="areaid区域ID")
    private String areaid;

    /**
     * 区域名称
     */
    @ApiModelProperty(value="area区域名称")
    private String area;

    /**
     * 城市ID
     */
    @ApiModelProperty(value="cityid城市ID")
    private String cityid;

    private static final long serialVersionUID = 1L;

    public Areas(Integer id, String areaid, String area, String cityid) {
        this.id = id;
        this.areaid = areaid;
        this.area = area;
        this.cityid = cityid;
    }

    public Areas() {
        super();
    }

    /**
     * 获取唯一ID
     *
     * @return id - 唯一ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置唯一ID
     *
     * @param id 唯一ID
     */
    public Areas setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 获取区域ID
     *
     * @return areaid - 区域ID
     */
    public String getAreaid() {
        return areaid;
    }

    /**
     * 设置区域ID
     *
     * @param areaid 区域ID
     */
    public Areas setAreaid(String areaid) {
        this.areaid = areaid;
        return this;
    }

    /**
     * 获取区域名称
     *
     * @return area - 区域名称
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置区域名称
     *
     * @param area 区域名称
     */
    public Areas setArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * 获取城市ID
     *
     * @return cityid - 城市ID
     */
    public String getCityid() {
        return cityid;
    }

    /**
     * 设置城市ID
     *
     * @param cityid 城市ID
     */
    public Areas setCityid(String cityid) {
        this.cityid = cityid;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", areaid=").append(areaid);
        sb.append(", area=").append(area);
        sb.append(", cityid=").append(cityid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}