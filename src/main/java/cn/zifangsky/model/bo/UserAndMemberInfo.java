package cn.zifangsky.model.bo;

import java.util.Date;

public abstract class UserAndMemberInfo {

    private String id;

    private boolean deleted;

    /**
     * 真实姓名
     */
    private String username;

    /**
     * 帐号
     */
    private String accountName;

    /**
     * 密码
     */
    private String password;

    /**
     * 指纹特征
     */
    private String fingerprint;

    /**
     * 启用状态
     */
    private boolean enableStatus;

    /**
     * 锁定时间
     */
    private Date lockDateTime;

    /**
     * 登陆失败次数
     */
    private Integer failCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public boolean isEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(boolean enableStatus) {
        this.enableStatus = enableStatus;
    }

    public Date getLockDateTime() {
        return lockDateTime;
    }

    public void setLockDateTime(Date lockDateTime) {
        this.lockDateTime = lockDateTime;
    }

    public Integer getFailCount() {
        return failCount;
    }

    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }
}
