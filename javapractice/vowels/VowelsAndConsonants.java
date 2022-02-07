package javapractice.vowels;
import java.util.*;

public class VowelsAndConsonants {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a string");
		String input = scanner.nextLine();
		input = input.toLowerCase();
	
		int Vowel = 0, Consonant = 0;
		for(int i = 0; i<input.length();i++)
		{
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u')
			{
				Vowel++;
			}
			else
			{
				Consonant++;
			}
		}
		System.out.println("Number of vowels:\t " + Vowel) ;
		System.out.println(" Number of consonants:\t" + Consonant);
	}
	}
	

