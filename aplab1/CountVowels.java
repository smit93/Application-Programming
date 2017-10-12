public class CountVowels {
	public static void main(String[] args) {
		// write your solution here
		
		System.out.print("Character: ");
		char c = In.nextChar();
		int count = 0;
		while (c != '.'){
		   System.out.print("Character: ");
		   c = In.nextChar();
		    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
		     count++;
		  }
		  
	}
	System.out.println("Vowel count = " +count);
}
}
