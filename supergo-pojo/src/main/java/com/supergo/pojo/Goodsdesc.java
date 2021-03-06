package com.supergo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@ApiModel(value="com.supergo.pojo.Goodsdesc")
@Table(name = "tb_goods_desc")
public class Goodsdesc implements Serializable {
    /**
     * SPU_ID
     */
    @Id
    @Column(name = "goods_id")
    @ApiModelProperty(value="goodsIdSPU_ID")
    private Long goodsId;

    /**
     * 描述
     */
    @ApiModelProperty(value="introduction描述")
    private String introduction;

    /**
     * 规格结果集，所有规格，包含isSelected
     */
    @Column(name = "specification_items")
    @ApiModelProperty(value="specificationItems规格结果集，所有规格，包含isSelected")
    private String specificationItems;

    /**
     * 自定义属性（参数结果）
     */
    @Column(name = "custom_attribute_items")
    @ApiModelProperty(value="customAttributeItems自定义属性（参数结果）")
    private String customAttributeItems;

    @Column(name = "item_images")
    @ApiModelProperty(value="itemImages")
    private String itemImages;

    /**
     * 包装列表
     */
    @Column(name = "package_list")
    @ApiModelProperty(value="packageList包装列表")
    private String packageList;

    /**
     * 售后服务
     */
    @Column(name = "sale_service")
    @ApiModelProperty(value="saleService售后服务")
    private String saleService;

    private static final long serialVersionUID = 1L;

    public Goodsdesc(Long goodsId, String introduction, String specificationItems, String customAttributeItems, String itemImages, String packageList, String saleService) {
        this.goodsId = goodsId;
        this.introduction = introduction;
        this.specificationItems = specificationItems;
        this.customAttributeItems = customAttributeItems;
        this.itemImages = itemImages;
        this.packageList = packageList;
        this.saleService = saleService;
    }

    public Goodsdesc() {
        super();
    }

    /**
     * 获取SPU_ID
     *
     * @return goods_id - SPU_ID
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * 设置SPU_ID
     *
     * @param goodsId SPU_ID
     */
    public Goodsdesc setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    /**
     * 获取描述
     *
     * @return introduction - 描述
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 设置描述
     *
     * @param introduction 描述
     */
    public Goodsdesc setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }

    /**
     * 获取规格结果集，所有规格，包含isSelected
     *
     * @return specification_items - 规格结果集，所有规格，包含isSelected
     */
    public String getSpecificationItems() {
        return specificationItems;
    }

    /**
     * 设置规格结果集，所有规格，包含isSelected
     *
     * @param specificationItems 规格结果集，所有规格，包含isSelected
     */
    public Goodsdesc setSpecificationItems(String specificationItems) {
        this.specificationItems = specificationItems;
        return this;
    }

    /**
     * 获取自定义属性（参数结果）
     *
     * @return custom_attribute_items - 自定义属性（参数结果）
     */
    public String getCustomAttributeItems() {
        return customAttributeItems;
    }

    /**
     * 设置自定义属性（参数结果）
     *
     * @param customAttributeItems 自定义属性（参数结果）
     */
    public Goodsdesc setCustomAttributeItems(String customAttributeItems) {
        this.customAttributeItems = customAttributeItems;
        return this;
    }

    /**
     * @return item_images
     */
    public String getItemImages() {
        return itemImages;
    }

    /**
     * @param itemImages
     */
    public Goodsdesc setItemImages(String itemImages) {
        this.itemImages = itemImages;
        return this;
    }

    /**
     * 获取包装列表
     *
     * @return package_list - 包装列表
     */
    public String getPackageList() {
        return packageList;
    }

    /**
     * 设置包装列表
     *
     * @param packageList 包装列表
     */
    public Goodsdesc setPackageList(String packageList) {
        this.packageList = packageList;
        return this;
    }

    /**
     * 获取售后服务
     *
     * @return sale_service - 售后服务
     */
    public String getSaleService() {
        return saleService;
    }

    /**
     * 设置售后服务
     *
     * @param saleService 售后服务
     */
    public Goodsdesc setSaleService(String saleService) {
        this.saleService = saleService;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsId=").append(goodsId);
        sb.append(", introduction=").append(introduction);
        sb.append(", specificationItems=").append(specificationItems);
        sb.append(", customAttributeItems=").append(customAttributeItems);
        sb.append(", itemImages=").append(itemImages);
        sb.append(", packageList=").append(packageList);
        sb.append(", saleService=").append(saleService);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}