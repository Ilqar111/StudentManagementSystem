/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Ilqar
 */
public class Registers implements Serializable{
    private String login;
    private String password;
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }           

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
    
    @Override
    public String toString() {
        return "Login=" + getLogin() + "Password=" + getPassword();
    }
    
    
}
