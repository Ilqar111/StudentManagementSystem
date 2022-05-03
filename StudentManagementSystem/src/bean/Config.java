/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;
import java.io.Serializable;
import java.util.ArrayList;
import util.FileUtility;

/**
 *
 * @author Ilqar
 */
public class Config implements Serializable{

    
    ArrayList<Teacher> teachers=new ArrayList<>();
    ArrayList<Student> students=new ArrayList<>();
    ArrayList<Registers> registers=new ArrayList();
public static Config config=null;
public static void initialize(){
    Object obj=FileUtility.readObjectFromFile("app.obj");
    if(obj== null)
        return;
    if(obj instanceof Config)
        config=(Config)obj;
}
private static boolean loggedIn;
    public Teacher[] getTeachers() {
        Teacher[] t=new Teacher[teachers.size()];
        for (int i = 0; i < t.length; i++) {
            t[i]=teachers.get(i);
        }
        return t;
    }

    public void setTeachers(Teacher teachers) {
        this.teachers.add(teachers);
    }

    public Student[] getStudents() {
   Student[] s=new Student[students.size()];
        for (int i = 0; i < s.length; i++) {
            s[i]=students.get(i);
        }
        return s;
    }
    public void setStudents(Student students) {
        this.students.add(students);
    }
     public void setRegisters(Registers registers) {
        this.registers.add(registers);
    }

    public boolean getRegisters(String login,String password) {
        for (int i = 0; i < registers.size(); i++){
            if(registers.get(i).getLogin().equals(login)){
                if(registers.get(i).getPassword().equals(password)){
                    return true;
                }
            }               
        }
        System.out.println("Bele istifadeci tapilmadi.");
        return false;
    } 
   public static Config instance(){
       if(config==null)
           config=new Config();
       return config;
           }
   public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }
}
