package com.supergo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@ApiModel(value="com.supergo.pojo.Order")
@Table(name = "tb_order")
public class Order implements Serializable {
    /**
     * 订单id
     */
    @Id
    @Column(name = "order_id")
    @ApiModelProperty(value="orderId订单id")
    private Long orderId;

    /**
     * 实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    @ApiModelProperty(value="payment实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分")
    private BigDecimal payment;

    /**
     * 支付类型，1、在线支付，2、货到付款
     */
    @Column(name = "payment_type")
    @ApiModelProperty(value="paymentType支付类型，1、在线支付，2、货到付款")
    private String paymentType;

    /**
     * 邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    @Column(name = "post_fee")
    @ApiModelProperty(value="postFee邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分")
    private String postFee;

    /**
     * 状态：1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭,7、待评价
     */
    @ApiModelProperty(value="status状态：1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭,7、待评价")
    private String status;

    /**
     * 订单创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="createTime订单创建时间")
    private Date createTime;

    /**
     * 订单更新时间
     */
    @Column(name = "update_time")
    @ApiModelProperty(value="updateTime订单更新时间")
    private Date updateTime;

    /**
     * 付款时间
     */
    @Column(name = "payment_time")
    @ApiModelProperty(value="paymentTime付款时间")
    private Date paymentTime;

    /**
     * 发货时间
     */
    @Column(name = "consign_time")
    @ApiModelProperty(value="consignTime发货时间")
    private Date consignTime;

    /**
     * 交易完成时间
     */
    @Column(name = "end_time")
    @ApiModelProperty(value="endTime交易完成时间")
    private Date endTime;

    /**
     * 交易关闭时间
     */
    @Column(name = "close_time")
    @ApiModelProperty(value="closeTime交易关闭时间")
    private Date closeTime;

    /**
     * 物流名称
     */
    @Column(name = "shipping_name")
    @ApiModelProperty(value="shippingName物流名称")
    private String shippingName;

    /**
     * 物流单号
     */
    @Column(name = "shipping_code")
    @ApiModelProperty(value="shippingCode物流单号")
    private String shippingCode;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="userId用户id")
    private String userId;

    /**
     * 买家留言
     */
    @Column(name = "buyer_message")
    @ApiModelProperty(value="buyerMessage买家留言")
    private String buyerMessage;

    /**
     * 买家昵称
     */
    @Column(name = "buyer_nick")
    @ApiModelProperty(value="buyerNick买家昵称")
    private String buyerNick;

    /**
     * 买家是否已经评价
     */
    @Column(name = "buyer_rate")
    @ApiModelProperty(value="buyerRate买家是否已经评价")
    private String buyerRate;

    /**
     * 收货人地区名称(省，市，县)街道
     */
    @Column(name = "receiver_area_name")
    @ApiModelProperty(value="receiverAreaName收货人地区名称(省，市，县)街道")
    private String receiverAreaName;

    /**
     * 收货人手机
     */
    @Column(name = "receiver_mobile")
    @ApiModelProperty(value="receiverMobile收货人手机")
    private String receiverMobile;

    /**
     * 收货人邮编
     */
    @Column(name = "receiver_zip_code")
    @ApiModelProperty(value="receiverZipCode收货人邮编")
    private String receiverZipCode;

    /**
     * 收货人
     */
    @ApiModelProperty(value="receiver收货人")
    private String receiver;

    /**
     * 过期时间，定期清理
     */
    @ApiModelProperty(value="expire过期时间，定期清理")
    private Date expire;

    /**
     * 发票类型(普通发票，电子发票，增值税发票)
     */
    @Column(name = "invoice_type")
    @ApiModelProperty(value="invoiceType发票类型(普通发票，电子发票，增值税发票)")
    private String invoiceType;

    /**
     * 订单来源：1:app端，2：pc端，3：M端，4：微信端，5：手机qq端
     */
    @Column(name = "source_type")
    @ApiModelProperty(value="sourceType订单来源：1:app端，2：pc端，3：M端，4：微信端，5：手机qq端")
    private String sourceType;

    /**
     * 商家ID
     */
    @Column(name = "seller_id")
    @ApiModelProperty(value="sellerId商家ID")
    private String sellerId;

    private static final long serialVersionUID = 1L;

    public Order(Long orderId, BigDecimal payment, String paymentType, String postFee, String status, Date createTime, Date updateTime, Date paymentTime, Date consignTime, Date endTime, Date closeTime, String shippingName, String shippingCode, String userId, String buyerMessage, String buyerNick, String buyerRate, String receiverAreaName, String receiverMobile, String receiverZipCode, String receiver, Date expire, String invoiceType, String sourceType, String sellerId) {
        this.orderId = orderId;
        this.payment = payment;
        this.paymentType = paymentType;
        this.postFee = postFee;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.paymentTime = paymentTime;
        this.consignTime = consignTime;
        this.endTime = endTime;
        this.closeTime = closeTime;
        this.shippingName = shippingName;
        this.shippingCode = shippingCode;
        this.userId = userId;
        this.buyerMessage = buyerMessage;
        this.buyerNick = buyerNick;
        this.buyerRate = buyerRate;
        this.receiverAreaName = receiverAreaName;
        this.receiverMobile = receiverMobile;
        this.receiverZipCode = receiverZipCode;
        this.receiver = receiver;
        this.expire = expire;
        this.invoiceType = invoiceType;
        this.sourceType = sourceType;
        this.sellerId = sellerId;
    }

    public Order() {
        super();
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
    public Order setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 获取实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
     *
     * @return payment - 实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    public BigDecimal getPayment() {
        return payment;
    }

    /**
     * 设置实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
     *
     * @param payment 实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    public Order setPayment(BigDecimal payment) {
        this.payment = payment;
        return this;
    }

    /**
     * 获取支付类型，1、在线支付，2、货到付款
     *
     * @return payment_type - 支付类型，1、在线支付，2、货到付款
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * 设置支付类型，1、在线支付，2、货到付款
     *
     * @param paymentType 支付类型，1、在线支付，2、货到付款
     */
    public Order setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    /**
     * 获取邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分
     *
     * @return post_fee - 邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    public String getPostFee() {
        return postFee;
    }

    /**
     * 设置邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分
     *
     * @param postFee 邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    public Order setPostFee(String postFee) {
        this.postFee = postFee;
        return this;
    }

    /**
     * 获取状态：1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭,7、待评价
     *
     * @return status - 状态：1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭,7、待评价
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态：1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭,7、待评价
     *
     * @param status 状态：1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭,7、待评价
     */
    public Order setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 获取订单创建时间
     *
     * @return create_time - 订单创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置订单创建时间
     *
     * @param createTime 订单创建时间
     */
    public Order setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 获取订单更新时间
     *
     * @return update_time - 订单更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置订单更新时间
     *
     * @param updateTime 订单更新时间
     */
    public Order setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 获取付款时间
     *
     * @return payment_time - 付款时间
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * 设置付款时间
     *
     * @param paymentTime 付款时间
     */
    public Order setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
        return this;
    }

    /**
     * 获取发货时间
     *
     * @return consign_time - 发货时间
     */
    public Date getConsignTime() {
        return consignTime;
    }

    /**
     * 设置发货时间
     *
     * @param consignTime 发货时间
     */
    public Order setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
        return this;
    }

    /**
     * 获取交易完成时间
     *
     * @return end_time - 交易完成时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置交易完成时间
     *
     * @param endTime 交易完成时间
     */
    public Order setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 获取交易关闭时间
     *
     * @return close_time - 交易关闭时间
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * 设置交易关闭时间
     *
     * @param closeTime 交易关闭时间
     */
    public Order setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
        return this;
    }

    /**
     * 获取物流名称
     *
     * @return shipping_name - 物流名称
     */
    public String getShippingName() {
        return shippingName;
    }

    /**
     * 设置物流名称
     *
     * @param shippingName 物流名称
     */
    public Order setShippingName(String shippingName) {
        this.shippingName = shippingName;
        return this;
    }

    /**
     * 获取物流单号
     *
     * @return shipping_code - 物流单号
     */
    public String getShippingCode() {
        return shippingCode;
    }

    /**
     * 设置物流单号
     *
     * @param shippingCode 物流单号
     */
    public Order setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
        return this;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public Order setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 获取买家留言
     *
     * @return buyer_message - 买家留言
     */
    public String getBuyerMessage() {
        return buyerMessage;
    }

    /**
     * 设置买家留言
     *
     * @param buyerMessage 买家留言
     */
    public Order setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage;
        return this;
    }

    /**
     * 获取买家昵称
     *
     * @return buyer_nick - 买家昵称
     */
    public String getBuyerNick() {
        return buyerNick;
    }

    /**
     * 设置买家昵称
     *
     * @param buyerNick 买家昵称
     */
    public Order setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
        return this;
    }

    /**
     * 获取买家是否已经评价
     *
     * @return buyer_rate - 买家是否已经评价
     */
    public String getBuyerRate() {
        return buyerRate;
    }

    /**
     * 设置买家是否已经评价
     *
     * @param buyerRate 买家是否已经评价
     */
    public Order setBuyerRate(String buyerRate) {
        this.buyerRate = buyerRate;
        return this;
    }

    /**
     * 获取收货人地区名称(省，市，县)街道
     *
     * @return receiver_area_name - 收货人地区名称(省，市，县)街道
     */
    public String getReceiverAreaName() {
        return receiverAreaName;
    }

    /**
     * 设置收货人地区名称(省，市，县)街道
     *
     * @param receiverAreaName 收货人地区名称(省，市，县)街道
     */
    public Order setReceiverAreaName(String receiverAreaName) {
        this.receiverAreaName = receiverAreaName;
        return this;
    }

    /**
     * 获取收货人手机
     *
     * @return receiver_mobile - 收货人手机
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * 设置收货人手机
     *
     * @param receiverMobile 收货人手机
     */
    public Order setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
        return this;
    }

    /**
     * 获取收货人邮编
     *
     * @return receiver_zip_code - 收货人邮编
     */
    public String getReceiverZipCode() {
        return receiverZipCode;
    }

    /**
     * 设置收货人邮编
     *
     * @param receiverZipCode 收货人邮编
     */
    public Order setReceiverZipCode(String receiverZipCode) {
        this.receiverZipCode = receiverZipCode;
        return this;
    }

    /**
     * 获取收货人
     *
     * @return receiver - 收货人
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * 设置收货人
     *
     * @param receiver 收货人
     */
    public Order setReceiver(String receiver) {
        this.receiver = receiver;
        return this;
    }

    /**
     * 获取过期时间，定期清理
     *
     * @return expire - 过期时间，定期清理
     */
    public Date getExpire() {
        return expire;
    }

    /**
     * 设置过期时间，定期清理
     *
     * @param expire 过期时间，定期清理
     */
    public Order setExpire(Date expire) {
        this.expire = expire;
        return this;
    }

    /**
     * 获取发票类型(普通发票，电子发票，增值税发票)
     *
     * @return invoice_type - 发票类型(普通发票，电子发票，增值税发票)
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * 设置发票类型(普通发票，电子发票，增值税发票)
     *
     * @param invoiceType 发票类型(普通发票，电子发票，增值税发票)
     */
    public Order setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }

    /**
     * 获取订单来源：1:app端，2：pc端，3：M端，4：微信端，5：手机qq端
     *
     * @return source_type - 订单来源：1:app端，2：pc端，3：M端，4：微信端，5：手机qq端
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * 设置订单来源：1:app端，2：pc端，3：M端，4：微信端，5：手机qq端
     *
     * @param sourceType 订单来源：1:app端，2：pc端，3：M端，4：微信端，5：手机qq端
     */
    public Order setSourceType(String sourceType) {
        this.sourceType = sourceType;
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
    public Order setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", payment=").append(payment);
        sb.append(", paymentType=").append(paymentType);
        sb.append(", postFee=").append(postFee);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", consignTime=").append(consignTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", closeTime=").append(closeTime);
        sb.append(", shippingName=").append(shippingName);
        sb.append(", shippingCode=").append(shippingCode);
        sb.append(", userId=").append(userId);
        sb.append(", buyerMessage=").append(buyerMessage);
        sb.append(", buyerNick=").append(buyerNick);
        sb.append(", buyerRate=").append(buyerRate);
        sb.append(", receiverAreaName=").append(receiverAreaName);
        sb.append(", receiverMobile=").append(receiverMobile);
        sb.append(", receiverZipCode=").append(receiverZipCode);
        sb.append(", receiver=").append(receiver);
        sb.append(", expire=").append(expire);
        sb.append(", invoiceType=").append(invoiceType);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", sellerId=").append(sellerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}