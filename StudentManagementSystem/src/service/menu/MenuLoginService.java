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
      Config.setLoggedIn(Config.instance().getRegisters(MenuServiceUtil.requireText("Login"), MenuServiceUtil.requireText("Password")));  
    }
}