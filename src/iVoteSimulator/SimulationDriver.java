package iVoteSimulator;
import java.util.Random;
import java.util.*;

public class SimulationDriver {
	public static void main(String[] args){
		int numberOfStudent;
		int questionType;
		int randNumber = 0;
		char multiAnswer;
		String singleAnswer;
		char letter = ' ';
		
		Random rand= new Random();
		IVoteService IVoteObj = new IVoteService();
		
		//Generate the number of student randomly
		numberOfStudent = rand.nextInt(20)+1;
		System.out.println("Number of student: "+numberOfStudent);		
		
		//Generate 0 or 1 Random number to choose the question type
		questionType = rand.nextInt(2);	
	
		//If questionType = 0, create multiple choice question 
		if(questionType == 0){
			MultipleQuestion multObj = new MultipleQuestion(questionType);
			int countA = 0;
			int countB = 0;
			int countC = 0;
			int countD = 0;
			
			for (int i=0; i < numberOfStudent; i++){
				
				Student obj = new Student();
				//Initialize answerType
				char answerType = 0;
				
				//Generate 0 to 4 Random number to choice the answer
				//each number is declare to specific letter as A,B,C,or D
				randNumber =rand.nextInt(4);
				if(randNumber == 0)
					answerType = 'A';
				if(randNumber == 1)
					answerType = 'B';
				if(randNumber == 2)
					answerType = 'C';
				if(randNumber == 3)
					answerType = 'D';
				
				//Set the students answer to IVote Service class 
				IVoteObj.setCandidateMultipleChoiceAnswer(answerType);
				
				//Figure out the number of student that answered  
				//to the same choice
				letter = IVoteObj.studentSubmition(answerType);
				if(letter == 'A')
					countA++;
				if(letter == 'B')
					countB++;
				if(letter == 'C')
					countC++;
				if(letter == 'D')
					countD++;
			System.out.println("Student ID: "+obj.getStudentID()+"  choose: "+letter);
				
			}
			//Display the statistic 
			IVoteObj.display(countA, countB, countC, countD,multObj.getAnswer());
		}
		
		//When questionType = 1, single choice question is choosing  
		else{		
			int countRight = 0;
			int countWrong = 0;
			SingleQuestion singleObj = new SingleQuestion(questionType);
			for(int i = 0; i< numberOfStudent; i++){
				String answerType = "";
				Student obj = new Student();
				
				//Generate 0 or 1 Random number for 
				//choosing 0 for Right answer and 1 for wrong answer 
				randNumber = rand.nextInt(2);				   
				if(randNumber == 0)
					answerType = "Right";
				else
					answerType = "Wrong";
				IVoteObj.setCandidateSingleChoiceAnswer(answerType);
				
				//Figure out how many student choice option 1.Right  
				//and how many student choose option 2.Wrong
				String word = IVoteObj.studentSubmition(answerType);
				if(word == "Right")
					countRight++;
				if(word == "Wrong")
					countWrong++;
				System.out.println("Student ID: "+obj.getStudentID()+"  choose: "+answerType);

			}
			//Display the statistic
			IVoteObj.display(countRight,countWrong,singleObj.getAnswer());
			
		}
		
		
	}
}
