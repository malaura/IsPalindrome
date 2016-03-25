
public class Stack {
	/**
	 * head of the stack
	 */
	public Node headNode;
	
	
	
	/**
	 * Pushes an item onto the top of this stack. 
	 * 
	 * @param the item to be pushed onto this stack.
	 * @return the item character. 
	 */	
	public char push(char item){
		if(headNode == null){
			headNode = new Node(); //sets aside actual memory so pointers are not moved accidentally
			headNode.node = item; 
		}
		else{
			Node newNode = new Node();
			newNode.node = item;
			newNode.next = headNode;
			headNode = newNode; 
		}
		return item; 
	}
	
	/**
	 * Removes the character at the top of this stack and returns that object as the value of this function.
	 * 
	 * @return The character at the top of this stack  
	 */	
	public char pop(){
		char removedNode;
		if(headNode.next == null){
			removedNode = headNode.node;
			headNode = null;
		}
		else{
			removedNode = headNode.node;
			headNode = headNode.next;
		}
		return removedNode; 

	}
	
	/**
	 * Checks if this stack is empty.
	 * 
	 * @return true if and only if this stack contains no items; false otherwise.
	 */	
	public boolean isEmpty(){

		if(headNode == null){	
			return true;
		}
		return false;
	}
	
}
	


