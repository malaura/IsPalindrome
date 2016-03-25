import java.util.Scanner;

/**
 * Program designed to take input from user and check if the phrase or word is a palindrome.
 * @author Maria Laura Rodriguez
 */

public class Palindrome {
	
	 /**
	  * This is the main method which makes use of isPalindrome method. Takes input from user.
	  * 
	  * @param args Unused.
	  * @return Nothing.
	  */
	public static void main(String[] args) {
	     String i = null;
	     Scanner sc = new Scanner(System.in);
	     boolean a = true;
	     while(a){
	    	i = sc.nextLine();
	    	a = false;
	     }
	     i = (i.toLowerCase()).replaceAll("\\s",""); // makes the input lower case, removes white space
	     System.out.println(is_Palindrome(i));
	}
	
	/**
	 * Checks if a phrase is a palindrome or not. 
	 * 
	 * @param word string from the user input
	 * @return returns true if it is a palindrome, false if not. 
	 */	
	public static boolean is_Palindrome(String word){
	    Stack newStack = new Stack();
	    Queue newQueue = new Queue();
		for(int i = 0; i < word.length(); i++){
			newStack.push(word.charAt(i));
			newQueue.enqueue(word.charAt(i));
		}
		for(int i = 0; i < word.length(); i++){
			if(newQueue.dequeue() != newStack.pop()) //compares the char
				return false; //returns false if the chars are not equal to each other
		}
		return true; //returns true if it passes the test
	}
}
