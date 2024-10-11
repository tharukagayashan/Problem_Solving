import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input a String to Reverse : ");
		String word = scanner.nextLine();
		
		char[]arr = word.toCharArray();
		
		int size = arr.length;
		
		String newWord = "";
		
		for(int i=size-1;i>=0;i--) {
			
			newWord = newWord + arr[i]; 
			
		}

		scanner.close();
		
		System.out.println(newWord);
	}

}
