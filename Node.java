package ontap;
public class Node {
	Node left, right;
	int data;
	Node(int data){
		this.data = data;
		left = right = null;
	}
	public void print() {
		System.out.print(this.data +  " ");
	}
}
