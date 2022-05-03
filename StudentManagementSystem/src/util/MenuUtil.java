/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;
import service.menu.MenuServiceUtil;

/**
 *
 * @author Ilqar
 */
public class MenuUtil {
public static void showMenu(){
    Menu.showAllMenu();
   Menu selectMenu =Menu.find(MenuServiceUtil.requireNumber("Please select menu"));
   try{
   selectMenu.process();
   }catch(Exception e){
       System.out.println("Duzgun sec.");
       showMenu();
   }
}

}