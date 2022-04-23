/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author Ilqar
 */
public class MenuUtil {
public static void showMenu(){
    Menu.showAllMenu();
    System.out.println("Please select menu:");
    Scanner scan=new Scanner(System.in);
    int selectMenuNumber=scan.nextInt();
   Menu selectMenu =Menu.find(selectMenuNumber);
   selectMenu.process();
}

}