
public class Queue {
	/**
	 * head of the queue
	 */
	public Node headNode;
	
	/**
	 * tails of the queue
	 */
	public Node tailNode;
	
	
	
	/**
	 * Inserts the specified element into the end of the queue.
	 * 
	 * @param item the char to be added to the end of the queue
	 * @return the item character
	 */
	public char enqueue(char item){
		
		Node node = new Node();
		node.node = item;
		if(headNode == null){
			headNode = tailNode = node;
		}
		else{
			tailNode.next = node;
		}
		tailNode = node;
		return item; 
	}
	
	/**
	 * Removes an element from the front of a queue
	 * 
	 * @return the removed node
	 */
	public char dequeue(){
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
	 * @return true if it is empty, false if it is not.
	 */
	public boolean isEmpty(){
		if(headNode == null){	
			return true;
		}
		return false;
	}
		
		
}
