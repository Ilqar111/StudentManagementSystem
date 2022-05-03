/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Student;
import bean.Teacher;
import java.util.Scanner;
import service.menu.inter.MenuAddStudentInter;
import service.menu.inter.MenuAddTeacherInter;
import util.FileUtility;

/**
 *
 * @author Ilqar
 */
public class MenuAddTeacher implements MenuAddTeacherInter{

    @Override
    public void procces() {
        Teacher t=new Teacher();
        t.setName(MenuServiceUtil.requireText("Name"));
        t.setSurname(MenuServiceUtil.requireText("Surname"));
        t.setSchoolName(MenuServiceUtil.requireText("SchoolName"));
        t.setSalary(MenuServiceUtil.requireNumber("Salary"));
        Config.instance().setTeachers(t);
        FileUtility.writeObjectToFile(Config.instance(),"app.obj");
    }
    
}
