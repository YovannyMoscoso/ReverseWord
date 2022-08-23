package test;

public class ReverseString {
	
	public static void main(String[] args) {
		
		
		String reversedString = reverseString("java");
		System.out.println(reversedString);
		
	}
	
	//This method will return an String in a reversed order
  
	public static String reverseString(String word) {
		char[] myArray = new char[word.length()];
		String newWord = "";
		for(int i = word.length()-1; i >=0; i--) {
			myArray[i] = word.charAt(i);
			newWord = newWord + myArray[i];
		}
		return newWord;
	}

}
