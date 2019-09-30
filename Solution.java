public class Solution {

	static boolean palindrome(String s) {
		s = s.toLowerCase();
		if (s.length()==0 || s.length()==1) return true;
		else if (s.charAt(0)==s.charAt(s.length()-1)) {
			return palindrome(s.substring(1, s.length()-1));
		}
		else return false;
	}
	
	static void result(String s) {
		if (palindrome(s)) {
			System.out.println("Given string \"" + s + "\" is a palindrome.");
		}
		else System.out.println("Given string \"" + s + "\" is NOT a palindrome.");
	}
	
	public static void main(String[] args) {
		result("abcba");
		result("argentinamanitnegra");
		result("Sapalsaritadedatiraslapas");	//s.toLowerCase() is implemented because of this example
		result("abccb");
		result("stirna");
		result("mammam");	//not mentioned in examples but I implemented even palindromes as well, not just odd ones
	}
}
