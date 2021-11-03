package ontap;
public class Main {

	public static void main(String[] args) {
		BinaryTree bst = new BinaryTree();
		bst.add(42);
		bst.add(23);
		bst.add(74);
		bst.add(11);
		bst.add(65);
		bst.add(58);
		bst.add(94);
		bst.add(36);
		bst.add(99);
		bst.add(87);
		bst.print();
		System.out.println(bst.sum());
		bst.odd();
		System.out.println(bst.countTree());
		System.out.println(bst.division(2, 3));
		System.out.println("Chieu cao cay: " + bst.chieucaocay());
		}

}
