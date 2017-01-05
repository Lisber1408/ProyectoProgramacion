/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.renta.controller;

import com.renta.model.AdminModel;

/**
 *
 * @author PRINCIPAL-PC
 */
public class AdminController {
    
    public boolean loginAdministrador (String user, String psword){
        AdminModel admin = new AdminModel();
        if (admin.getUser().equals(user) && admin.getPassword().equals (psword)){
            return (true);
        }else{
            return (false);
        }
        
    }
}
