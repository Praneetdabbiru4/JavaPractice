package javapractice.vowels;
import java.util.*;

public class VowelsAndConsonants {
	public static void main(String[] args) {
		int vowels = 0;
		int consonants = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a string");
		String input = scanner.nextLine();
		input = input.toLowerCase();
		for (int i=0; i<input.length(); i++) {
			if(input.charAt(i)=='a'|| input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u' );
			vowels += 1;
		}else{
			consonants+=1;
		}  
		System.out.println("vowels: "+vowels);
		System.out.println("consonants: "+consonants);
	}
	
}
