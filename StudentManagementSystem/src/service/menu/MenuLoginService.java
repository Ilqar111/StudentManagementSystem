/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import java.util.Scanner;
import service.menu.inter.MenuLoginServiceInter;
import service.menu.inter.MenuService;

/**
 *
 * @author Ilqar
 */
public class MenuLoginService implements MenuLoginServiceInter {

    @Override
    public void procces() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Login:");
        String login=scan.next();
        scan=new Scanner(System.in);
        System.out.print("Password:");
        String password=scan.next();
        if(!(login.equals("perfect")&&password.equals("123"))){
            throw new IllegalArgumentException("Login or Password is invalid");
    }
        Config.setLoggedIn(true);
    
}
}