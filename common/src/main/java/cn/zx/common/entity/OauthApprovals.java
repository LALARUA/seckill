package cn.zx.common.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "seckill.oauth_approvals")
public class OauthApprovals {
    @Column(name = "userId")
    private String userid;

    @Column(name = "clientId")
    private String clientid;

    private String scope;

    private String status;

    @Column(name = "expiresAt")
    private Date expiresat;

    @Column(name = "lastModifiedAt")
    private Date lastmodifiedat;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "client_id")
    private String clientId;

    @Column(name = "expires_at")
    private Date expiresAt;

    @Column(name = "last_modified_at")
    private Date lastModifiedAt;

    @Column(name = "user_id")
    private String userId;

    /**
     * @return userId
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
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
    public void setClientid(String clientid) {
        this.clientid = clientid;
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
    public void setScope(String scope) {
        this.scope = scope;
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
    public void setStatus(String status) {
        this.status = status;
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
    public void setExpiresat(Date expiresat) {
        this.expiresat = expiresat;
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
    public void setLastmodifiedat(Date lastmodifiedat) {
        this.lastmodifiedat = lastmodifiedat;
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
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
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * @return expires_at
     */
    public Date getExpiresAt() {
        return expiresAt;
    }

    /**
     * @param expiresAt
     */
    public void setExpiresAt(Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * @return last_modified_at
     */
    public Date getLastModifiedAt() {
        return lastModifiedAt;
    }

    /**
     * @param lastModifiedAt
     */
    public void setLastModifiedAt(Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    /**
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
}