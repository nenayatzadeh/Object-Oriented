package iVoteSimulator;

public class MultipleQuestion extends Question {
	private char answer = 'A';
	private int questionType;
	public MultipleQuestion(int qt){
			questionType = qt;
			System.out.println("Multiple Choice Question");
			System.out.println("What is the 12 data type? ");
			System.out.println("A.Integer    B.Double    C.Float    D.String");
		
	}
	public int getQuestionType(){
		return questionType;
	}
	public char getAnswer() {
		return answer;
	}
	public void setAnswer(char answer) {
		this.answer = answer;
	}
}
