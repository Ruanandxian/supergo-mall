package com.supergo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@ApiModel(value="com.supergo.pojo.Oauthclientdetails")
@Table(name = "oauth_client_details")
public class Oauthclientdetails implements Serializable {
    @Id
    @Column(name = "client_id")
    @ApiModelProperty(value="clientId")
    private String clientId;

    @Column(name = "resource_ids")
    @ApiModelProperty(value="resourceIds")
    private String resourceIds;

    @Column(name = "client_secret")
    @ApiModelProperty(value="clientSecret")
    private String clientSecret;

    @ApiModelProperty(value="scope")
    private String scope;

    @Column(name = "authorized_grant_types")
    @ApiModelProperty(value="authorizedGrantTypes")
    private String authorizedGrantTypes;

    @Column(name = "web_server_redirect_uri")
    @ApiModelProperty(value="webServerRedirectUri")
    private String webServerRedirectUri;

    @ApiModelProperty(value="authorities")
    private String authorities;

    @Column(name = "access_token_validity")
    @ApiModelProperty(value="accessTokenValidity")
    private Integer accessTokenValidity;

    @Column(name = "refresh_token_validity")
    @ApiModelProperty(value="refreshTokenValidity")
    private Integer refreshTokenValidity;

    @Column(name = "additional_information")
    @ApiModelProperty(value="additionalInformation")
    private String additionalInformation;

    @ApiModelProperty(value="autoapprove")
    private String autoapprove;

    private static final long serialVersionUID = 1L;

    public Oauthclientdetails(String clientId, String resourceIds, String clientSecret, String scope, String authorizedGrantTypes, String webServerRedirectUri, String authorities, Integer accessTokenValidity, Integer refreshTokenValidity, String additionalInformation, String autoapprove) {
        this.clientId = clientId;
        this.resourceIds = resourceIds;
        this.clientSecret = clientSecret;
        this.scope = scope;
        this.authorizedGrantTypes = authorizedGrantTypes;
        this.webServerRedirectUri = webServerRedirectUri;
        this.authorities = authorities;
        this.accessTokenValidity = accessTokenValidity;
        this.refreshTokenValidity = refreshTokenValidity;
        this.additionalInformation = additionalInformation;
        this.autoapprove = autoapprove;
    }

    public Oauthclientdetails() {
        super();
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
    public Oauthclientdetails setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * @return resource_ids
     */
    public String getResourceIds() {
        return resourceIds;
    }

    /**
     * @param resourceIds
     */
    public Oauthclientdetails setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    /**
     * @return client_secret
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * @param clientSecret
     */
    public Oauthclientdetails setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
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
    public Oauthclientdetails setScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * @return authorized_grant_types
     */
    public String getAuthorizedGrantTypes() {
        return authorizedGrantTypes;
    }

    /**
     * @param authorizedGrantTypes
     */
    public Oauthclientdetails setAuthorizedGrantTypes(String authorizedGrantTypes) {
        this.authorizedGrantTypes = authorizedGrantTypes;
        return this;
    }

    /**
     * @return web_server_redirect_uri
     */
    public String getWebServerRedirectUri() {
        return webServerRedirectUri;
    }

    /**
     * @param webServerRedirectUri
     */
    public Oauthclientdetails setWebServerRedirectUri(String webServerRedirectUri) {
        this.webServerRedirectUri = webServerRedirectUri;
        return this;
    }

    /**
     * @return authorities
     */
    public String getAuthorities() {
        return authorities;
    }

    /**
     * @param authorities
     */
    public Oauthclientdetails setAuthorities(String authorities) {
        this.authorities = authorities;
        return this;
    }

    /**
     * @return access_token_validity
     */
    public Integer getAccessTokenValidity() {
        return accessTokenValidity;
    }

    /**
     * @param accessTokenValidity
     */
    public Oauthclientdetails setAccessTokenValidity(Integer accessTokenValidity) {
        this.accessTokenValidity = accessTokenValidity;
        return this;
    }

    /**
     * @return refresh_token_validity
     */
    public Integer getRefreshTokenValidity() {
        return refreshTokenValidity;
    }

    /**
     * @param refreshTokenValidity
     */
    public Oauthclientdetails setRefreshTokenValidity(Integer refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
        return this;
    }

    /**
     * @return additional_information
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * @param additionalInformation
     */
    public Oauthclientdetails setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
        return this;
    }

    /**
     * @return autoapprove
     */
    public String getAutoapprove() {
        return autoapprove;
    }

    /**
     * @param autoapprove
     */
    public Oauthclientdetails setAutoapprove(String autoapprove) {
        this.autoapprove = autoapprove;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", clientId=").append(clientId);
        sb.append(", resourceIds=").append(resourceIds);
        sb.append(", clientSecret=").append(clientSecret);
        sb.append(", scope=").append(scope);
        sb.append(", authorizedGrantTypes=").append(authorizedGrantTypes);
        sb.append(", webServerRedirectUri=").append(webServerRedirectUri);
        sb.append(", authorities=").append(authorities);
        sb.append(", accessTokenValidity=").append(accessTokenValidity);
        sb.append(", refreshTokenValidity=").append(refreshTokenValidity);
        sb.append(", additionalInformation=").append(additionalInformation);
        sb.append(", autoapprove=").append(autoapprove);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}