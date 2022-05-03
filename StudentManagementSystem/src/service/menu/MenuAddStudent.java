/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Student;
import java.util.Scanner;
import service.menu.inter.MenuAddStudentInter;
import util.FileUtility;

/**
 *
 * @author Ilqar
 */
public class MenuAddStudent implements MenuAddStudentInter{

    @Override
    public void procces() {
        Student s=new Student();
        s.setName(MenuServiceUtil.requireText("Name"));
        s.setSurname(MenuServiceUtil.requireText("Surname"));
        s.setSchoolName(MenuServiceUtil.requireText("Schoolname"));
        s.setScholarship(MenuServiceUtil.requireNumber("Scholarship"));
        Config.instance().setStudents(s);
        FileUtility.writeObjectToFile(Config.instance(),"app.obj");
    }
    
}
