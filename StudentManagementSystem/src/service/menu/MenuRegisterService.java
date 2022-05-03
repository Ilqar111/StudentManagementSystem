/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Registers;
import service.menu.inter.MenuRegisterServiceInter;
import service.menu.inter.MenuService;
import util.FileUtility;

/**
 *
 * @author Ilqar
 */
public class MenuRegisterService implements MenuRegisterServiceInter {

    @Override
    public void procces() {
        Registers r=new Registers();
     r.setLogin(MenuServiceUtil.requireText("Login"));
     r.setPassword(MenuServiceUtil.requireText("Password"));
     Config.instance().setRegisters(r);
        FileUtility.writeObjectToFile(Config.instance(), "app.obj");
    }
    
}
