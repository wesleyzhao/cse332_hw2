
public class BinaryTree {
	private BinaryTree left_child;
	private BinaryTree right_child;
	private int key;
	
	public BinaryTree(int key_num){
		//construct empty tree
		left_child = null;
		right_child = null;
		key = key_num;
	}
	
	public BinaryTree getLeftTree(){
		return left_child;
	}
	
	public BinaryTree getRightTree(){
		return right_child;
	}
	
	public boolean isEmpty(){
		//return if tree is empty
		if (left_child!=null && right_child!=null){
			return true;
		}
		else{
			return false;
		}
	}
	
	public int getKey(){
		return key;
	}
	
	
}
