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

/**
 *
 * @author Ilqar
 */
public class MenuAddTeacher implements MenuAddTeacherInter{

    @Override
    public void procces() {
        Teacher t=new Teacher();
        t.setName(MenuUtil.requireText("Name"));
        t.setSurname(MenuUtil.requireText("Surname"));
        t.setSchoolName(MenuUtil.requireText("SchoolName"));
        t.setSalary(MenuUtil.requireNumber("Salary"));
        Config.instance().setTeachers(t);
    }
    
}
