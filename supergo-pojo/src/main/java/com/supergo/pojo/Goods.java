package com.supergo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@ApiModel(value="com.supergo.pojo.Goods")
@Table(name = "tb_goods")
public class Goods implements Serializable {
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="id主键")
    private Long id;

    /**
     * 商家ID
     */
    @Column(name = "seller_id")
    @ApiModelProperty(value="sellerId商家ID")
    private String sellerId;

    /**
     * SPU名
     */
    @Column(name = "goods_name")
    @ApiModelProperty(value="goodsNameSPU名")
    private String goodsName;

    /**
     * 默认SKU
     */
    @Column(name = "default_item_id")
    @ApiModelProperty(value="defaultItemId默认SKU")
    private Long defaultItemId;

    /**
     * 状态
     */
    @Column(name = "audit_status")
    @ApiModelProperty(value="auditStatus状态")
    private String auditStatus;

    /**
     * 是否上架
     */
    @Column(name = "is_marketable")
    @ApiModelProperty(value="isMarketable是否上架")
    private String isMarketable;

    /**
     * 品牌
     */
    @Column(name = "brand_id")
    @ApiModelProperty(value="brandId品牌")
    private Long brandId;

    /**
     * 副标题
     */
    @ApiModelProperty(value="caption副标题")
    private String caption;

    /**
     * 一级类目
     */
    @Column(name = "category1_id")
    @ApiModelProperty(value="category1Id一级类目")
    private Long category1Id;

    /**
     * 二级类目
     */
    @Column(name = "category2_id")
    @ApiModelProperty(value="category2Id二级类目")
    private Long category2Id;

    /**
     * 三级类目
     */
    @Column(name = "category3_id")
    @ApiModelProperty(value="category3Id三级类目")
    private Long category3Id;

    /**
     * 小图
     */
    @Column(name = "small_pic")
    @ApiModelProperty(value="smallPic小图")
    private String smallPic;

    /**
     * 商城价
     */
    @ApiModelProperty(value="price商城价")
    private BigDecimal price;

    /**
     * 分类模板ID
     */
    @Column(name = "type_template_id")
    @ApiModelProperty(value="typeTemplateId分类模板ID")
    private Long typeTemplateId;

    /**
     * 是否启用规格
     */
    @Column(name = "is_enable_spec")
    @ApiModelProperty(value="isEnableSpec是否启用规格")
    private String isEnableSpec;

    /**
     * 是否删除
     */
    @Column(name = "is_delete")
    @ApiModelProperty(value="isDelete是否删除")
    private String isDelete;

    private static final long serialVersionUID = 1L;

    public Goods(Long id, String sellerId, String goodsName, Long defaultItemId, String auditStatus, String isMarketable, Long brandId, String caption, Long category1Id, Long category2Id, Long category3Id, String smallPic, BigDecimal price, Long typeTemplateId, String isEnableSpec, String isDelete) {
        this.id = id;
        this.sellerId = sellerId;
        this.goodsName = goodsName;
        this.defaultItemId = defaultItemId;
        this.auditStatus = auditStatus;
        this.isMarketable = isMarketable;
        this.brandId = brandId;
        this.caption = caption;
        this.category1Id = category1Id;
        this.category2Id = category2Id;
        this.category3Id = category3Id;
        this.smallPic = smallPic;
        this.price = price;
        this.typeTemplateId = typeTemplateId;
        this.isEnableSpec = isEnableSpec;
        this.isDelete = isDelete;
    }

    public Goods() {
        super();
    }

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public Goods setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 获取商家ID
     *
     * @return seller_id - 商家ID
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * 设置商家ID
     *
     * @param sellerId 商家ID
     */
    public Goods setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * 获取SPU名
     *
     * @return goods_name - SPU名
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 设置SPU名
     *
     * @param goodsName SPU名
     */
    public Goods setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }

    /**
     * 获取默认SKU
     *
     * @return default_item_id - 默认SKU
     */
    public Long getDefaultItemId() {
        return defaultItemId;
    }

    /**
     * 设置默认SKU
     *
     * @param defaultItemId 默认SKU
     */
    public Goods setDefaultItemId(Long defaultItemId) {
        this.defaultItemId = defaultItemId;
        return this;
    }

    /**
     * 获取状态
     *
     * @return audit_status - 状态
     */
    public String getAuditStatus() {
        return auditStatus;
    }

    /**
     * 设置状态
     *
     * @param auditStatus 状态
     */
    public Goods setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }

    /**
     * 获取是否上架
     *
     * @return is_marketable - 是否上架
     */
    public String getIsMarketable() {
        return isMarketable;
    }

    /**
     * 设置是否上架
     *
     * @param isMarketable 是否上架
     */
    public Goods setIsMarketable(String isMarketable) {
        this.isMarketable = isMarketable;
        return this;
    }

    /**
     * 获取品牌
     *
     * @return brand_id - 品牌
     */
    public Long getBrandId() {
        return brandId;
    }

    /**
     * 设置品牌
     *
     * @param brandId 品牌
     */
    public Goods setBrandId(Long brandId) {
        this.brandId = brandId;
        return this;
    }

    /**
     * 获取副标题
     *
     * @return caption - 副标题
     */
    public String getCaption() {
        return caption;
    }

    /**
     * 设置副标题
     *
     * @param caption 副标题
     */
    public Goods setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * 获取一级类目
     *
     * @return category1_id - 一级类目
     */
    public Long getCategory1Id() {
        return category1Id;
    }

    /**
     * 设置一级类目
     *
     * @param category1Id 一级类目
     */
    public Goods setCategory1Id(Long category1Id) {
        this.category1Id = category1Id;
        return this;
    }

    /**
     * 获取二级类目
     *
     * @return category2_id - 二级类目
     */
    public Long getCategory2Id() {
        return category2Id;
    }

    /**
     * 设置二级类目
     *
     * @param category2Id 二级类目
     */
    public Goods setCategory2Id(Long category2Id) {
        this.category2Id = category2Id;
        return this;
    }

    /**
     * 获取三级类目
     *
     * @return category3_id - 三级类目
     */
    public Long getCategory3Id() {
        return category3Id;
    }

    /**
     * 设置三级类目
     *
     * @param category3Id 三级类目
     */
    public Goods setCategory3Id(Long category3Id) {
        this.category3Id = category3Id;
        return this;
    }

    /**
     * 获取小图
     *
     * @return small_pic - 小图
     */
    public String getSmallPic() {
        return smallPic;
    }

    /**
     * 设置小图
     *
     * @param smallPic 小图
     */
    public Goods setSmallPic(String smallPic) {
        this.smallPic = smallPic;
        return this;
    }

    /**
     * 获取商城价
     *
     * @return price - 商城价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置商城价
     *
     * @param price 商城价
     */
    public Goods setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    /**
     * 获取分类模板ID
     *
     * @return type_template_id - 分类模板ID
     */
    public Long getTypeTemplateId() {
        return typeTemplateId;
    }

    /**
     * 设置分类模板ID
     *
     * @param typeTemplateId 分类模板ID
     */
    public Goods setTypeTemplateId(Long typeTemplateId) {
        this.typeTemplateId = typeTemplateId;
        return this;
    }

    /**
     * 获取是否启用规格
     *
     * @return is_enable_spec - 是否启用规格
     */
    public String getIsEnableSpec() {
        return isEnableSpec;
    }

    /**
     * 设置是否启用规格
     *
     * @param isEnableSpec 是否启用规格
     */
    public Goods setIsEnableSpec(String isEnableSpec) {
        this.isEnableSpec = isEnableSpec;
        return this;
    }

    /**
     * 获取是否删除
     *
     * @return is_delete - 是否删除
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除
     *
     * @param isDelete 是否删除
     */
    public Goods setIsDelete(String isDelete) {
        this.isDelete = isDelete;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sellerId=").append(sellerId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", defaultItemId=").append(defaultItemId);
        sb.append(", auditStatus=").append(auditStatus);
        sb.append(", isMarketable=").append(isMarketable);
        sb.append(", brandId=").append(brandId);
        sb.append(", caption=").append(caption);
        sb.append(", category1Id=").append(category1Id);
        sb.append(", category2Id=").append(category2Id);
        sb.append(", category3Id=").append(category3Id);
        sb.append(", smallPic=").append(smallPic);
        sb.append(", price=").append(price);
        sb.append(", typeTemplateId=").append(typeTemplateId);
        sb.append(", isEnableSpec=").append(isEnableSpec);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}