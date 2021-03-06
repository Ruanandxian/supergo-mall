package com.supergo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@ApiModel(value="com.supergo.pojo.Oauthaccesstoken")
@Table(name = "oauth_access_token")
public class Oauthaccesstoken implements Serializable {
    @Id
    @Column(name = "authentication_id")
    @ApiModelProperty(value="authenticationId")
    private String authenticationId;

    @Column(name = "token_id")
    @ApiModelProperty(value="tokenId")
    private String tokenId;

    @Column(name = "user_name")
    @ApiModelProperty(value="userName")
    private String userName;

    @Column(name = "client_id")
    @ApiModelProperty(value="clientId")
    private String clientId;

    @Column(name = "refresh_token")
    @ApiModelProperty(value="refreshToken")
    private String refreshToken;

    @ApiModelProperty(value="token")
    private byte[] token;

    @ApiModelProperty(value="authentication")
    private byte[] authentication;

    private static final long serialVersionUID = 1L;

    public Oauthaccesstoken(String authenticationId, String tokenId, String userName, String clientId, String refreshToken) {
        this.authenticationId = authenticationId;
        this.tokenId = tokenId;
        this.userName = userName;
        this.clientId = clientId;
        this.refreshToken = refreshToken;
    }

    public Oauthaccesstoken(String authenticationId, String tokenId, String userName, String clientId, String refreshToken, byte[] token, byte[] authentication) {
        this.authenticationId = authenticationId;
        this.tokenId = tokenId;
        this.userName = userName;
        this.clientId = clientId;
        this.refreshToken = refreshToken;
        this.token = token;
        this.authentication = authentication;
    }

    public Oauthaccesstoken() {
        super();
    }

    /**
     * @return authentication_id
     */
    public String getAuthenticationId() {
        return authenticationId;
    }

    /**
     * @param authenticationId
     */
    public Oauthaccesstoken setAuthenticationId(String authenticationId) {
        this.authenticationId = authenticationId;
        return this;
    }

    /**
     * @return token_id
     */
    public String getTokenId() {
        return tokenId;
    }

    /**
     * @param tokenId
     */
    public Oauthaccesstoken setTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public Oauthaccesstoken setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * @return client_id
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * @param clientId
     */
    public Oauthaccesstoken setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * @return refresh_token
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * @param refreshToken
     */
    public Oauthaccesstoken setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * @return token
     */
    public byte[] getToken() {
        return token;
    }

    /**
     * @param token
     */
    public Oauthaccesstoken setToken(byte[] token) {
        this.token = token;
        return this;
    }

    /**
     * @return authentication
     */
    public byte[] getAuthentication() {
        return authentication;
    }

    /**
     * @param authentication
     */
    public Oauthaccesstoken setAuthentication(byte[] authentication) {
        this.authentication = authentication;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", authenticationId=").append(authenticationId);
        sb.append(", tokenId=").append(tokenId);
        sb.append(", userName=").append(userName);
        sb.append(", clientId=").append(clientId);
        sb.append(", refreshToken=").append(refreshToken);
        sb.append(", token=").append(token);
        sb.append(", authentication=").append(authentication);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}