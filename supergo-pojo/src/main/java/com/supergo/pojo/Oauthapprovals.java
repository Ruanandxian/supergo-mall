package com.supergo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@ApiModel(value="com.supergo.pojo.Oauthapprovals")
@Table(name = "oauth_approvals")
public class Oauthapprovals implements Serializable {
    @Column(name = "userId")
    @ApiModelProperty(value="userid")
    private String userid;

    @Column(name = "clientId")
    @ApiModelProperty(value="clientid")
    private String clientid;

    @ApiModelProperty(value="scope")
    private String scope;

    @ApiModelProperty(value="status")
    private String status;

    @Column(name = "expiresAt")
    @ApiModelProperty(value="expiresat")
    private Date expiresat;

    @Column(name = "lastModifiedAt")
    @ApiModelProperty(value="lastmodifiedat")
    private Date lastmodifiedat;

    private static final long serialVersionUID = 1L;

    public Oauthapprovals(String userid, String clientid, String scope, String status, Date expiresat, Date lastmodifiedat) {
        this.userid = userid;
        this.clientid = clientid;
        this.scope = scope;
        this.status = status;
        this.expiresat = expiresat;
        this.lastmodifiedat = lastmodifiedat;
    }

    public Oauthapprovals() {
        super();
    }

    /**
     * @return userId
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public Oauthapprovals setUserid(String userid) {
        this.userid = userid;
        return this;
    }

    /**
     * @return clientId
     */
    public String getClientid() {
        return clientid;
    }

    /**
     * @param clientid
     */
    public Oauthapprovals setClientid(String clientid) {
        this.clientid = clientid;
        return this;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    /**
     * @param scope
     */
    public Oauthapprovals setScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public Oauthapprovals setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * @return expiresAt
     */
    public Date getExpiresat() {
        return expiresat;
    }

    /**
     * @param expiresat
     */
    public Oauthapprovals setExpiresat(Date expiresat) {
        this.expiresat = expiresat;
        return this;
    }

    /**
     * @return lastModifiedAt
     */
    public Date getLastmodifiedat() {
        return lastmodifiedat;
    }

    /**
     * @param lastmodifiedat
     */
    public Oauthapprovals setLastmodifiedat(Date lastmodifiedat) {
        this.lastmodifiedat = lastmodifiedat;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", clientid=").append(clientid);
        sb.append(", scope=").append(scope);
        sb.append(", status=").append(status);
        sb.append(", expiresat=").append(expiresat);
        sb.append(", lastmodifiedat=").append(lastmodifiedat);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}