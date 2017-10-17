package iVoteSimulator;

public class IVoteService{
	private int questionType;
	private char candidateMultipleChoiceAnswer;
	private String candidateSingleChoiceAnswer;
	
	public void setQuestionType(int qt){
		questionType = qt;
		if(qt == 0){
			System.out.println("Multiple Choice Question");
		}else{
			System.out.println("Single Choice Question");
		}	
	} 
	
	public int getQuestionType(){
		return questionType;
	}
	
	public void setCandidateMultipleChoiceAnswer(char candidateAnswer) {
		candidateMultipleChoiceAnswer = candidateAnswer;
	}
	
	public char getCandidateMultipleChoiceAnswer() {
		return candidateMultipleChoiceAnswer;
	}

	public void setCandidateSingleChoiceAnswer(String candidateSingleAnswer) {
		this.candidateSingleChoiceAnswer = candidateSingleAnswer;
	}
	public String getCandidateSingleChoiceAnswer() {
		return candidateSingleChoiceAnswer;
	}
	
	public char studentSubmition(char candidateMultipleChoiceAnswer){
				if(candidateMultipleChoiceAnswer == 'A')
					return candidateMultipleChoiceAnswer ;
				else if(candidateMultipleChoiceAnswer == 'B')
					return candidateMultipleChoiceAnswer ;
				else if(candidateMultipleChoiceAnswer == 'C')
					return candidateMultipleChoiceAnswer ;
				else
					return candidateMultipleChoiceAnswer ;
		}
	public String studentSubmition(String candidateSingleChoiceAnswer){
		
		if(candidateSingleChoiceAnswer == "Right")
			return candidateSingleChoiceAnswer;
		else 
			return candidateSingleChoiceAnswer;
}
	public void display(int a, int b, int c, int d, char correctAnswer){
		System.out.println("A: "+a+" B: "+b+" C: "+c+" D: "+d);
		System.out.println("correct answer is : " + correctAnswer);
	}
	public void display(int r, int w,String correctAnswer){
		System.out.println("1.Right: "+r+" 2.Wrong: "+w);
		System.out.println("correct answer is : "+ correctAnswer);
	}

}
