/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Student;
import java.util.Scanner;
import service.menu.inter.MenuAddStudentInter;

/**
 *
 * @author Ilqar
 */
public class MenuAddStudent implements MenuAddStudentInter{

    @Override
    public void procces() {
        Student s=new Student();
        s.setName(MenuUtil.requireText("Name"));
        s.setSurname(MenuUtil.requireText("Surname"));
        s.setSchoolName(MenuUtil.requireText("Schoolname"));
        s.setScholarship(MenuUtil.requireNumber("Scholarship"));
        Config.instance().setStudents(s);
    }
    
}
