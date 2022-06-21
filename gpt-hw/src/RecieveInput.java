import java.util.ArrayList;
import java.util.Scanner;



public class RecieveInput {

	public static ArrayList<String> userQuestion = new ArrayList<String>();
	static Scanner input = new Scanner(System.in);
	static String nextWord;

	
	public static void GetInput() {
		
		System.out.println("What is your question? Press Alt+3 to exit");
		System.out.println("   ");
		
		
		while (isTyping() == true) {
			nextWord = input.nextLine();
			userQuestion.add(nextWord);
		}
		
	}
	
	public static boolean isTyping() {
		
		try {
			if(nextWord.equals("1152")) {
				
				return false;
			}
		} catch (Exception NullPointerException) {
			nextWord = input.nextLine();
			userQuestion.add(nextWord);
		}
		return true;
	}

	
	
}
