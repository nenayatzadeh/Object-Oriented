package iVoteSimulator;

public class SingleQuestion extends Question {
	private String answer = "Right";
	private int questionType;
	public SingleQuestion(int qt){
			questionType = qt;
			System.out.println("Single Choice Answer");
			System.out.println("Number 12 is int data Type");
			System.out.println("1.Right	2.Wrong");	
			
	}
	public int getQuestionType(){
		return questionType;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAnswer() {
		return answer;
	}
	
	
}
