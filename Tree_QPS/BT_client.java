package Tree_QPS;

public class BT_client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] lvl = {1,2,3,4,5,6,-1,-1,-1,7,8};
//		BinaryTree bt = new BinaryTree(lvl);
		// bt.display();
//		bt.postOrder();
//		bt.lvl2();
		int[] in = {4,2,7,5,8,1,6,3};
		int[] pre = {1,2,4,5,7,8,3,6};
		BinaryTree bt = new BinaryTree(in,pre);
		bt.lvl2();
//		System.out.println("asfdfs");
//		bt.display();
	}
}
