/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.renta.model;

/**
 *
 * @author PRINCIPAL-PC
 */
public class AdminModel {
    private String user;
    private String password;

    
    public AdminModel() {
        this.user = "admin";
        this.password = "admin";
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
