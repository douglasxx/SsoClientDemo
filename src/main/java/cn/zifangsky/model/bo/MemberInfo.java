package cn.zifangsky.model.bo;

public class MemberInfo extends Member {

    /**
     * 是否有权限
     */
    private boolean hasRole;

    /**
     * 匹配用户名
     */
    private String mappingUserName;

    /**
     * 匹配账户名
     */
    private String mappingAccountName;

    public boolean isHasRole() {
        return hasRole;
    }

    public void setHasRole(boolean hasRole) {
        this.hasRole = hasRole;
    }

    public String getMappingUserName() {
        return mappingUserName;
    }

    public void setMappingUserName(String mappingUserName) {
        this.mappingUserName = mappingUserName;
    }

    public String getMappingAccountName() {
        return mappingAccountName;
    }

    public void setMappingAccountName(String mappingAccountName) {
        this.mappingAccountName = mappingAccountName;
    }
}
