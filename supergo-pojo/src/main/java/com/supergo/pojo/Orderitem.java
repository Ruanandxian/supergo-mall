package com.supergo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@ApiModel(value="com.supergo.pojo.Orderitem")
@Table(name = "tb_order_item")
public class Orderitem implements Serializable {
    @Id
    @ApiModelProperty(value="id")
    private Long id;

    /**
     * 商品id
     */
    @Column(name = "item_id")
    @ApiModelProperty(value="itemId商品id")
    private Long itemId;

    /**
     * SPU_ID
     */
    @Column(name = "goods_id")
    @ApiModelProperty(value="goodsIdSPU_ID")
    private Long goodsId;

    /**
     * 订单id
     */
    @Column(name = "order_id")
    @ApiModelProperty(value="orderId订单id")
    private Long orderId;

    /**
     * 商品标题
     */
    @ApiModelProperty(value="title商品标题")
    private String title;

    /**
     * 商品单价
     */
    @ApiModelProperty(value="price商品单价")
    private BigDecimal price;

    /**
     * 商品购买数量
     */
    @ApiModelProperty(value="num商品购买数量")
    private Integer num;

    /**
     * 商品总金额
     */
    @Column(name = "total_fee")
    @ApiModelProperty(value="totalFee商品总金额")
    private BigDecimal totalFee;

    /**
     * 商品图片地址
     */
    @Column(name = "pic_path")
    @ApiModelProperty(value="picPath商品图片地址")
    private String picPath;

    @Column(name = "seller_id")
    @ApiModelProperty(value="sellerId")
    private String sellerId;

    private static final long serialVersionUID = 1L;

    public Orderitem(Long id, Long itemId, Long goodsId, Long orderId, String title, BigDecimal price, Integer num, BigDecimal totalFee, String picPath, String sellerId) {
        this.id = id;
        this.itemId = itemId;
        this.goodsId = goodsId;
        this.orderId = orderId;
        this.title = title;
        this.price = price;
        this.num = num;
        this.totalFee = totalFee;
        this.picPath = picPath;
        this.sellerId = sellerId;
    }

    public Orderitem() {
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
    public Orderitem setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 获取商品id
     *
     * @return item_id - 商品id
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * 设置商品id
     *
     * @param itemId 商品id
     */
    public Orderitem setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
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
    public Orderitem setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    /**
     * 获取订单id
     *
     * @return order_id - 订单id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id
     *
     * @param orderId 订单id
     */
    public Orderitem setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 获取商品标题
     *
     * @return title - 商品标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置商品标题
     *
     * @param title 商品标题
     */
    public Orderitem setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 获取商品单价
     *
     * @return price - 商品单价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置商品单价
     *
     * @param price 商品单价
     */
    public Orderitem setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    /**
     * 获取商品购买数量
     *
     * @return num - 商品购买数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置商品购买数量
     *
     * @param num 商品购买数量
     */
    public Orderitem setNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * 获取商品总金额
     *
     * @return total_fee - 商品总金额
     */
    public BigDecimal getTotalFee() {
        return totalFee;
    }

    /**
     * 设置商品总金额
     *
     * @param totalFee 商品总金额
     */
    public Orderitem setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
        return this;
    }

    /**
     * 获取商品图片地址
     *
     * @return pic_path - 商品图片地址
     */
    public String getPicPath() {
        return picPath;
    }

    /**
     * 设置商品图片地址
     *
     * @param picPath 商品图片地址
     */
    public Orderitem setPicPath(String picPath) {
        this.picPath = picPath;
        return this;
    }

    /**
     * @return seller_id
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * @param sellerId
     */
    public Orderitem setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", itemId=").append(itemId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", orderId=").append(orderId);
        sb.append(", title=").append(title);
        sb.append(", price=").append(price);
        sb.append(", num=").append(num);
        sb.append(", totalFee=").append(totalFee);
        sb.append(", picPath=").append(picPath);
        sb.append(", sellerId=").append(sellerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}