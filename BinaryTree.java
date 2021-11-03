package ontap;
public class BinaryTree {
	Node root;
	BinaryTree(){
		root = null;
	}
	
	public void add(int value) {
		root = add(root, value);
	}
	private Node add(Node root, int value) {
		if(root == null) {
			root = new Node(value);
			root.right = root.left = null;
		}else if(root.data > value) {
			root.right = add(root.right, value);
		}else {
			root.left = add(root.left, value);
		}
		return root;
	}
	
	public void print() {
		print(root);
	}
	private void print(Node root) {
		if(root == null) return;
		root.print();
		print(root.right);
		print(root.left);
	}
//	count length bst
	private int count(Node root) {
		if(root == null) return 0;
		int a = count(root.left);
		int b = count(root.right);
		return a + b + 1;
	}
	public int count() {
		return this.count(root);
	}
//	Sum 
	private double sum(Node root) {
		if(root == null) return 0;
		return sum(root.right) + sum(root.left) + root.data;
	}
	public double sum() {
		return sum(root) / count();
	}
//	In ra các nút lẻ có lá
	public void odd() {
		odd(root);
	}
	private void odd(Node root) {
		if(root == null) return;
		if(root.data % 2 != 0 && root.right != null && root.left != null) {
			root.print();
		}
		odd(root.right);
		odd(root.left);
	}
//	đếm xem có bao nhiêu nút có 2 con
	public int countTree() {
		return countTree(root);
	}
	private int countTree(Node root) {
		if(root == null) return 0;
		if(root.right != null && root.left != null) {
			return countTree(root.right) + countTree(root.left) + 1;
		}else {
			return countTree(root.right) + countTree(root.left);
		}
	}
//	%x==0 && %y!=0
	public int division(int x, int y) {
		return division(root, x, y);
	}
	private int division(Node root,int x, int y) {
		if(root == null) return 0;
		else if(root.data % x == 0 && root.data % y != 0) {
			return division(root.right, x,y) + division(root.left, x,y) + 1;
		}else {
			return division(root.right, x,y) + division(root.left, x,y);
		}
		
	}
	public int chieucaocay() {
		return chieucaocay(root);
	}
	private int chieucaocay(Node root) {
		if(root==null) return 0;
		else {
			int chieucaotrai = chieucaocay(root.left);
			int chieucaophai = chieucaocay(root.right);
			if(chieucaotrai > chieucaophai) return chieucaotrai + 1;
			else return chieucaophai + 1;
		}
	}
}
