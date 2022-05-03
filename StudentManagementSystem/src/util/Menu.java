/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import bean.Config;
import service.menu.MenuAddStudent;
import service.menu.MenuAddTeacher;
import service.menu.MenuLoginService;
import service.menu.MenuRegisterService;
import service.menu.MenuShowStudents;
import service.menu.MenuShowTeachers;
import service.menu.inter.MenuService;

/**
 *
 * @author Ilqar
 */
public enum Menu {
         LOGIN(1,"Login",new MenuLoginService()),
    REGISTER(2,"Register",new MenuRegisterService()),
    ADD_TEACHER(3,"Add teacher",new MenuAddTeacher()),
    ADD_STUDENT(4,"Add student",new MenuAddStudent()),
    SHOW_ALL_TEACHER(5,"Show teachers",new MenuShowTeachers()),
    SHOW_ALL_STUDENT(6,"Show students",new MenuShowStudents()),
    UNKNOWN;
    private String label;
    private int number;
    private MenuService service;

    private Menu() {
    }
    
   private Menu(int number,String label,MenuService service) {
        this.label = label;
        this.number=number;
        this.service=service;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return number+"."+label;
    }
    public void process(){
       service.procces();
       MenuUtil.showMenu();
               
    }


    public int getNumber() {
        return number;
    }
    public static Menu find(int number){       
        Menu menus[]=Menu.values();
         for (int i = 0; i < menus.length; i++) {
             if(!Config.isLoggedIn()&& (number==1||number==2)){
        if(menus[i].getNumber()==number)
            return menus[i];
    }
             if(Config.isLoggedIn()&& (number==3||number==4||number==5||number==6)){
                if(menus[i].getNumber()==number)
                return menus[i];
             }
         }
    return Menu.UNKNOWN;
    }
    public static void showAllMenu(){
        Menu menus[]=Menu.values();
    for (int i = 0; i <menus.length; i++) {
        if(menus[i]!=UNKNOWN){
            if(menus[i]==LOGIN || menus[i]==REGISTER){
                if(!Config.isLoggedIn()){
        System.out.println(menus[i]);
                }
            }
            else if(Config.isLoggedIn()){
              System.out.println(menus[i]);  
        }
    }
    }
    }
}
