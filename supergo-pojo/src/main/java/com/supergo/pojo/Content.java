package com.supergo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@ApiModel(value="com.supergo.pojo.Content")
@Table(name = "tb_content")
public class Content implements Serializable {
    @Id
    @ApiModelProperty(value="id")
    private Long id;

    /**
     * 内容类目ID
     */
    @Column(name = "category_id")
    @ApiModelProperty(value="categoryId内容类目ID")
    private Long categoryId;

    /**
     * 内容标题
     */
    @ApiModelProperty(value="title内容标题")
    private String title;

    /**
     * 链接
     */
    @ApiModelProperty(value="url链接")
    private String url;

    /**
     * 图片绝对路径
     */
    @ApiModelProperty(value="pic图片绝对路径")
    private String pic;

    /**
     * 状态
     */
    @ApiModelProperty(value="status状态")
    private String status;

    /**
     * 排序
     */
    @Column(name = "sort_order")
    @ApiModelProperty(value="sortOrder排序")
    private Integer sortOrder;

    private static final long serialVersionUID = 1L;

    public Content(Long id, Long categoryId, String title, String url, String pic, String status, Integer sortOrder) {
        this.id = id;
        this.categoryId = categoryId;
        this.title = title;
        this.url = url;
        this.pic = pic;
        this.status = status;
        this.sortOrder = sortOrder;
    }

    public Content() {
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
    public Content setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 获取内容类目ID
     *
     * @return category_id - 内容类目ID
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * 设置内容类目ID
     *
     * @param categoryId 内容类目ID
     */
    public Content setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * 获取内容标题
     *
     * @return title - 内容标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置内容标题
     *
     * @param title 内容标题
     */
    public Content setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 获取链接
     *
     * @return url - 链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置链接
     *
     * @param url 链接
     */
    public Content setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 获取图片绝对路径
     *
     * @return pic - 图片绝对路径
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置图片绝对路径
     *
     * @param pic 图片绝对路径
     */
    public Content setPic(String pic) {
        this.pic = pic;
        return this;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public Content setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 获取排序
     *
     * @return sort_order - 排序
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * 设置排序
     *
     * @param sortOrder 排序
     */
    public Content setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", title=").append(title);
        sb.append(", url=").append(url);
        sb.append(", pic=").append(pic);
        sb.append(", status=").append(status);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}