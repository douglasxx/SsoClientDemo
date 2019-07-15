package cn.zifangsky.model.bo;

import java.util.Date;

public class Member extends UserAndMemberInfo {

	/**
	 * 描述：用户状态
	 */
	public enum StateType {
		// 未审核 已审核 禁用
		unaudited, audited, disable;
	}

	public enum EmailActive {
		/** 已经激活 */
		Y,
		/** 未激活 */
		N;
	}

	public enum Gender {
		//男 女 未知
		male,
		female,
		unknown
	}

	//昵称
	private String nickName;

	//头像
	private String portraits;

	//系统自生成的账号（7位数字）
	private String accountFromSys;

	//邮箱
	private String email;

	//用户地址
	private String address;

	//手机号
	private String mobilePhone;

	//用户状态
	private StateType stateType;

	//邮箱激活状态(Y 已经激活 N 未激活)
	private EmailActive emailActive;

	//激活码
	private String emailActiveKey;

	//激活码发放时间（用来检测是否超期）
	private Date emailActiveKeyDate;

	//描述信息
	private String describeInfo;

	//注册时间
	private Date registerDate;

	//密码重置Key
	private String passwordResetKey;

	//密码重置key发放时间
	private Date passwordResetKeyDate;

	//性别：男 女 未知
	private Gender gender;
	
	//站点id
	private String siteId;

	//临时禁用到期时间
	private Date forbiddenDate;

	//操作时间
	private Date operateDate;

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPortraits() {
		return portraits;
	}

	public void setPortraits(String portraits) {
		this.portraits = portraits;
	}

	public String getAccountFromSys() {
		return accountFromSys;
	}

	public void setAccountFromSys(String accountFromSys) {
		this.accountFromSys = accountFromSys;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public StateType getStateType() {
		return stateType;
	}

	public void setStateType(StateType stateType) {
		this.stateType = stateType;
	}

	public EmailActive getEmailActive() {
		return emailActive;
	}

	public void setEmailActive(EmailActive emailActive) {
		this.emailActive = emailActive;
	}

	public String getEmailActiveKey() {
		return emailActiveKey;
	}

	public void setEmailActiveKey(String emailActiveKey) {
		this.emailActiveKey = emailActiveKey;
	}

	public Date getEmailActiveKeyDate() {
		return emailActiveKeyDate;
	}

	public void setEmailActiveKeyDate(Date emailActiveKeyDate) {
		this.emailActiveKeyDate = emailActiveKeyDate;
	}

	public String getDescribeInfo() {
		return describeInfo;
	}

	public void setDescribeInfo(String describeInfo) {
		this.describeInfo = describeInfo;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public String getPasswordResetKey() {
		return passwordResetKey;
	}

	public void setPasswordResetKey(String passwordResetKey) {
		this.passwordResetKey = passwordResetKey;
	}

	public Date getPasswordResetKeyDate() {
		return passwordResetKeyDate;
	}

	public void setPasswordResetKeyDate(Date passwordResetKeyDate) {
		this.passwordResetKeyDate = passwordResetKeyDate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public Date getForbiddenDate() {
		return forbiddenDate;
	}

	public void setForbiddenDate(Date forbiddenDate) {
		this.forbiddenDate = forbiddenDate;
	}

	public Date getOperateDate() {
		return operateDate;
	}

	public void setOperateDate(Date operateDate) {
		this.operateDate = operateDate;
	}
}
