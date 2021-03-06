package com.supergo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@ApiModel(value="com.supergo.pojo.Specificationoption")
@Table(name = "tb_specification_option")
public class Specificationoption implements Serializable {
    /**
     * 规格项ID
     */
    @Id
    @ApiModelProperty(value="id规格项ID")
    private Long id;

    /**
     * 规格项名称
     */
    @Column(name = "option_name")
    @ApiModelProperty(value="optionName规格项名称")
    private String optionName;

    /**
     * 规格ID
     */
    @Column(name = "spec_id")
    @ApiModelProperty(value="specId规格ID")
    private Long specId;

    /**
     * 排序值
     */
    @ApiModelProperty(value="orders排序值")
    private Integer orders;

    private static final long serialVersionUID = 1L;

    public Specificationoption(Long id, String optionName, Long specId, Integer orders) {
        this.id = id;
        this.optionName = optionName;
        this.specId = specId;
        this.orders = orders;
    }

    public Specificationoption() {
        super();
    }

    /**
     * 获取规格项ID
     *
     * @return id - 规格项ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置规格项ID
     *
     * @param id 规格项ID
     */
    public Specificationoption setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 获取规格项名称
     *
     * @return option_name - 规格项名称
     */
    public String getOptionName() {
        return optionName;
    }

    /**
     * 设置规格项名称
     *
     * @param optionName 规格项名称
     */
    public Specificationoption setOptionName(String optionName) {
        this.optionName = optionName;
        return this;
    }

    /**
     * 获取规格ID
     *
     * @return spec_id - 规格ID
     */
    public Long getSpecId() {
        return specId;
    }

    /**
     * 设置规格ID
     *
     * @param specId 规格ID
     */
    public Specificationoption setSpecId(Long specId) {
        this.specId = specId;
        return this;
    }

    /**
     * 获取排序值
     *
     * @return orders - 排序值
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * 设置排序值
     *
     * @param orders 排序值
     */
    public Specificationoption setOrders(Integer orders) {
        this.orders = orders;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", optionName=").append(optionName);
        sb.append(", specId=").append(specId);
        sb.append(", orders=").append(orders);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}