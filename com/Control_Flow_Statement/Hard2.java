package com.Control_Flow_Statement;
/*2. The final grade of a student in a course is calculated as 30% of the exercise’s grade and as 70% of the exam’s grade, 
 * only if both grades are greater than or equal to 5; otherwise, the final grade will be their minimum. 
 * Write a program that reads continuously pairs of grades (exercises and exam grades) and displays the final grade for each student, 
 * until the user enters a pair of grades containing the value −1. Before it ends, 
 * the program should display the average grade of all students in the course. The program should check that all given grades belong in [0,10].
 */
import java.util.*;
public class Hard2 {
	public static void main(String args[]) {
		Scanner obj = new Scanner (System.in);
		double finalGrade = 0;
		int studentCount = 0;
		
			System.out.println("Enter the Exercise grade of the student"+(studentCount+1)+" : ");
			int exer = obj.nextInt();
			System.out.println("Enter the Exan grade of the student"+(studentCount+1)+" : ");
			int exam = obj.nextInt();
		while(exer >= 0 && exam >= 0) {
			studentCount++;
			finalGrade += ((exam*0.7)+(exer*0.3));
			System.out.println("Enter the Exercise grade of the student"+(studentCount+1)+" : ");
			exer = obj.nextInt();
			System.out.println("Enter the Exam grade of the student"+(studentCount+1)+" : ");
			exam = obj.nextInt();
		}
		System.out.println("The average grade for all students :  "+(finalGrade/studentCount));
	}
}
