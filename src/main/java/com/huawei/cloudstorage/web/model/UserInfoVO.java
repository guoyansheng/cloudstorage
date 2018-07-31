package com.huawei.cloudstorage.web.model;

import com.huawei.cloudstorage.constants.GlobalConstant;

public class UserInfoVO {
    private Integer id;

    /**
     * uid全局使用
     */
    private String userId;

    /**
     * 登录邮箱
     */
    private String loginNameEmail;
    /**
     * 登录手机号
     */
    private String loginNameMobile;
    
    /**
     * 登录邮箱
     */
    private String isLoginNameEmail = GlobalConstant.F;
    /**
     * 登录手机号
     */
    private String isLoginNameMobile = GlobalConstant.F;

    /**
     * 登录密码
     */
    private String loginPassword;

    /**
     * 支付密码
     */
    private String paymentPassword;

    /**
     * 花名
     */
    private String nickName;

    /**
     * 真是姓名
     */
    private String realName;

    /**
     * 证件类型
     */
    private String certType;

    /**
     * 证件号码
     */
    private String certNo;
    
    /**
     * 账户状态
     */
    private String state;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 手机号码
     */
    private String mobileNo;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 出生日期
     */
    private String birthdateStr;

    /**
     * 星座
     */
    private String constellation;

    /**
     * 年龄
     */
    private Short age;

    /**
     * 月收入
     */
    private Integer income;

    /**
     * 身高体重CM
     */
    private Short height;

    /**
     * 体重KG
     */
    private Short weight;

    /**
     * 职业
     */
    private String job;

    /**
     * 兴趣爱好
     */
    private String interest;

    /**
     * 个人简介
     */
    private String introduce;

    /**
     * 备注
     */
    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	public String getLoginNameEmail() {
        return loginNameEmail;
    }

    public void setLoginNameEmail(String loginNameEmail) {
        this.loginNameEmail = loginNameEmail == null ? null : loginNameEmail.trim();
    }

    public String getLoginNameMobile() {
        return loginNameMobile;
    }

    public void setLoginNameMobile(String loginNameMobile) {
        this.loginNameMobile = loginNameMobile == null ? null : loginNameMobile.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    public String getPaymentPassword() {
        return paymentPassword;
    }

    public void setPaymentPassword(String paymentPassword) {
        this.paymentPassword = paymentPassword == null ? null : paymentPassword.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

	/**
	 * @return the birthdateStr
	 */
	public String getBirthdateStr() {
		return birthdateStr;
	}

	/**
	 * @param birthdateStr the birthdateStr to set
	 */
	public void setBirthdateStr(String birthdateStr) {
		this.birthdateStr = birthdateStr;
	}

	public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation == null ? null : constellation.trim();
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public Short getHeight() {
        return height;
    }

    public void setHeight(Short height) {
        this.height = height;
    }

    public Short getWeight() {
        return weight;
    }

    public void setWeight(Short weight) {
        this.weight = weight;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest == null ? null : interest.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

	/**
	 * @return the isLoginNameEmail
	 */
	public String getIsLoginNameEmail() {
		return isLoginNameEmail;
	}

	/**
	 * @param isLoginNameEmail the isLoginNameEmail to set
	 */
	public void setIsLoginNameEmail(String isLoginNameEmail) {
		this.isLoginNameEmail = isLoginNameEmail;
	}

	/**
	 * @return the isLoginNameMobile
	 */
	public String getIsLoginNameMobile() {
		return isLoginNameMobile;
	}

	/**
	 * @param isLoginNameMobile the isLoginNameMobile to set
	 */
	public void setIsLoginNameMobile(String isLoginNameMobile) {
		this.isLoginNameMobile = isLoginNameMobile;
	}
    
}