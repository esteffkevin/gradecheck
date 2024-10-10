/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentsgrade;

/**
 *
 * @author kevinesteff
 */
public class Student {
    
    
    // attributes
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;
    
    
    // method to calculate the final grade adding them altogether
    public double finalGrade(){
        return grade1 + grade2 + grade3;
    }
    
    
    // method to calculate the missing points.
    // if the grade is 60 or more, will return 0, so student passed.
    public double missingPoints(){
        if(finalGrade() < 60.0){
            return 60.0 - finalGrade();
        }
        else{
            return 0.0;
        }
   
    }
}
    
    
    
    

