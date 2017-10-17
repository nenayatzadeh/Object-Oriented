package iVoteSimulator;
import java.util.*;

public class Student {
	private String studentID;

	public Student(){
		
		Random rand = new Random();
		
		//Generate the Student ID
		int number = rand.nextInt(Integer.MAX_VALUE) + 1;
		
		//Convert integer to string
		String studentID = Integer.toString(number);
		
		//Calling setStudentID method to set the student ID
		setStudentID(studentID);
		
	}
	
	public void setStudentID(String s) {
		studentID = s;
		
	}
	
	//Returning the student ID
	public String getStudentID() {
		return studentID;
	}
	
}
