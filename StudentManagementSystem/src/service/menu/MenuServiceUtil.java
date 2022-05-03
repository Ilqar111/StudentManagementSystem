/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import java.util.Scanner;

/**
 *
 * @author Ilqar
 */
public class MenuServiceUtil {
    public static String requireText(String title){
        Scanner scan=new Scanner(System.in);
        System.out.print(title+":");
        String answer=scan.nextLine();
        return answer;
    }
    public static int requireNumber(String title){
        Scanner scan=new Scanner(System.in);
        System.out.print(title+":");
        int number=scan.nextInt();
        return number;
    }
}
