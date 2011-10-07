
public class Stack {
	private int[] mainStack;
	private int currentIndex;
	
	public Stack(){
		mainStack = new int[1000];	//assume stack size is 1000
		currentIndex = 0;
	}
	
	public int pop(){
	/*
	 * returns the integer at the top of the stack
	 * which is the last integer to be added
	 * also removed that integer from the stack
	 */
		currentIndex--;
		return mainStack[currentIndex+1];
	}
	
	public int push(int number){
	/*
	 * movesnumber int number to the top of the stack
	 * returns the arg number
	 */
		currentIndex++;
		mainStack[currentIndex] = number;
		return number;
	}
	
	public int top(){
	/*
	 * returns the next integer at the top of the stack
	 * without taking it out of the stack
	 */
		return mainStack[currentIndex];	//should there be error handling for empty Stack?
	}
	
	public boolean isEmpty(){
		if (currentIndex == 0){
			return true;
		}
		else{
			return false;
		}
	}

}
