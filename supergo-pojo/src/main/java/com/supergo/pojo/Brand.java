package com.supergo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@ApiModel(value="com.supergo.pojo.Brand")
@Table(name = "tb_brand")
public class Brand implements Serializable {
    @Id
    @ApiModelProperty(value="id")
    private Long id;

    /**
     * 品牌名称
     */
    @ApiModelProperty(value="name品牌名称")
    private String name;

    /**
     * 品牌首字母
     */
    @Column(name = "first_char")
    @ApiModelProperty(value="firstChar品牌首字母")
    private String firstChar;

    private static final long serialVersionUID = 1L;

    public Brand(Long id, String name, String firstChar) {
        this.id = id;
        this.name = name;
        this.firstChar = firstChar;
    }

    public Brand() {
        super();
    }

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public Brand setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 获取品牌名称
     *
     * @return name - 品牌名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置品牌名称
     *
     * @param name 品牌名称
     */
    public Brand setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 获取品牌首字母
     *
     * @return first_char - 品牌首字母
     */
    public String getFirstChar() {
        return firstChar;
    }

    /**
     * 设置品牌首字母
     *
     * @param firstChar 品牌首字母
     */
    public Brand setFirstChar(String firstChar) {
        this.firstChar = firstChar;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", firstChar=").append(firstChar);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}