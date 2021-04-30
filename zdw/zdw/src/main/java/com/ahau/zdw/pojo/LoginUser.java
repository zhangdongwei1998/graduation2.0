package com.ahau.zdw.pojo;

import javax.persistence.*;

@Table(name = "login_user")
public class LoginUser {
    @Id
    private Integer id;

    @Column(name = "login_id")
    private Integer loginId;

    private String password;

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
     * @return login_id
     */
    public Integer getLoginId() {
        return loginId;
    }

    /**
     * @param loginId
     */
    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}