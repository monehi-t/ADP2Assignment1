/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp2assignment1;

/**
 *
 * @author CPUT
 */
public class StudentId {
    
     //Disabling Test code
    public int addition(int a, int b) {
        return a + b;
    }
    
    
     
    //Student program
    private String name, surname, studentNum;
    
    //Setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    @Override
    public String toString() {
        return "Application{" + "name=" + name + ", surname=" + surname + ", studentNum=" + studentNum + '}';
    }
    
    
}
