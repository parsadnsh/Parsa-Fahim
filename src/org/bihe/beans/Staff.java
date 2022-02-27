package org.bihe.beans;

import java.io.Serializable;

/**
 * author : PARSA
 */
public class Staff implements Serializable {

    private static final long serialVersionUID = 1l;

    private int staffID;
    private String fullName;
    private String email;
    private String role;
    private String skype;
    private String mobile;

    public Staff() {

    }

    public Staff(int staffID, String fullName, String email, String role, String skype, String mobile) {
        this.staffID = staffID;
        this.fullName = fullName;
        this.email = email;
        this.role = role;
        this.skype = skype;
        this.mobile = mobile;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
