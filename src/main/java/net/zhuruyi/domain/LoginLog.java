package net.zhuruyi.domain;

import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable {

    private int loginLogId;
    private int userID;
    private String ip;
    private Date LoginDate;


    public int getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLoginDate() {
        return LoginDate;
    }

    public void setLoginDate(Date loginDate) {
        LoginDate = loginDate;
    }

    @Override
    public String toString() {
        return "LoginLog{" +
                "loginLogId=" + loginLogId +
                ", userID=" + userID +
                ", ip='" + ip + '\'' +
                ", LoginDate=" + LoginDate +
                '}';
    }
}
