/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentsgrade;

import java.util.Scanner;



/**
 *
 * @author kevinesteff
 */
public class StudentsGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        
        //creating a new object (student)
        Student student = new Student();
        
        // user input, first line is the name the other three are the grades for the trimester
        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();
        
        // final grade output
        System.out.printf("TOTAL GRADE= %.2f%n",student.finalGrade());
        
        
        // if grade is less than 60, will print fail and say the points that are missing to pass
        if(student.finalGrade() < 60.0){
            System.out.println("FAIL!");
            System.out.printf("MISSING %.2f ", student.missingPoints(), "POINTS");
        }
        
        
        // closing scanner
        sc.close();
        
    }
}
