package Tree_QPS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
	private Scanner sc = new Scanner(System.in);

	private class Node {
		public Node(int i) {
			// TODO Auto-generated constructor stub
			val = i;
		}

		public Node() {
			// TODO Auto-generated constructor stub

		}

		public String toString() {
			return val + " ";
		}

		int val;
		Node left;
		Node right;
	}

	private Node root; // null

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		this.root = build(null);
	}

	public BinaryTree(int[] lvl) {
		create_lvl(lvl);
	}

	public BinaryTree(int[] in, int[] pre) {
		root = create_in_pre(in, 0, in.length - 1, pre, 0, pre.length - 1);
	}

	private Node build(Node parent) {
		// TODO Auto-generated method stub

		System.out.println("Node ki value kya insert karna chahte ho?");
		int data = sc.nextInt();
		System.out.println(data);

		Node nn = new Node();
		nn.val = data;// 10

		System.out.println("Kya " + nn.val + " ka left child banana hai?");
		boolean kyaLeftBananaHai = sc.nextBoolean();

		if (kyaLeftBananaHai) {
			nn.left = build(nn);
		}

		System.out.println("Kya " + nn.val + " ka right child banana hai?");
		boolean kyaRightBananaHai = sc.nextBoolean();

		if (kyaRightBananaHai) {
			nn.right = build(nn);
		}
		return nn;
	}

	public void display() {
		// TODO Auto-generated method stub
		display(root);
	}

	private void display(Node parent) {
		// TODO Auto-generated method stub
		if (parent == null) {
			return;
		}

		String str = "";
		// agar left child hai to str mein append krdo
		if (parent.left != null) {
			str += parent.left.val;
		} else {
			str += '_';
		}

		str += " -> " + parent.val + " <- ";

		// agar right child hai to str mein append krdo
		if (parent.right != null) {
			str += parent.right.val;
		} else {
			str += '_';
		}

		System.out.println(str);

		display(parent.left);
		display(parent.right);
	}
	// 10 true 20 true 40 false false true 50 false false true 30 true 60 false
	// false false

	public void preOrder() {
		// TODO Auto-generated method stub

		preOrder(this.root);
	}

	private void preOrder(Node main) {
		// TODO Auto-generated method stub

		if (main == null) {
			return;
		}
		System.out.println(main.val);
		preOrder(main.left);
		preOrder(main.right);
	}

	public void postOrder() {
		// TODO Auto-generated method stub
		postOrder(root);
	}

	private void postOrder(Node main) {
		// TODO Auto-generated method stub

		if (main == null) {
			return;
		}

		postOrder(main.left);
		postOrder(main.right);
		System.out.println(main.val);
	}

	public void inOrder() {
		// TODO Auto-generated method stub
		inOrder(root);
	}

	private void inOrder(Node main) {
		// TODO Auto-generated method stub

		if (main == null) {
			return;
		}

		inOrder(main.left);
		System.out.println(main.val);
		inOrder(main.right);
	}

	public int maxDepth(Node root) {

		if (root == null) {
			return 0;
		}

		int recLh = maxDepth(root.left);
		int recRh = maxDepth(root.right);

		int maxH = Math.max(recLh, recRh);
		int meraH = maxH + 1;
		return meraH;
	}

	public boolean hasPathSum(Node root, int targetSum) {

		if (root == null) {
			return false;
		}

		if (root.left == null && root.right == null) {// main hun leaf pr -> ek root to leaf path mil gya hai
			int res = targetSum - root.val;
			if (res == 0) {
				return true;
			}
		}

		boolean left = hasPathSum(root.left, targetSum - root.val);
		boolean right = hasPathSum(root.right, targetSum - root.val);

		return left || right;
	}

	public void lvl() {
		Queue<Node> Q = new LinkedList<Node>();
		Q.add(root);
		while (!Q.isEmpty()) {
			Node Curr = Q.poll();
			if (Curr == null) {
				continue;
			}
			// Self work!!
			System.out.print(Curr.val + " ");

			// bache to dalo
			Q.add(Curr.left);
			Q.add(Curr.right);

		}
	}

	public void lvl2() {
		Queue<Node> Curr_Q = new LinkedList<Node>();
		Queue<Node> Next_Q = new LinkedList<Node>();

		Curr_Q.add(root);
		while (!Curr_Q.isEmpty()) {
			Node Curr = Curr_Q.poll();

			// Self work!!
			System.out.print(Curr.val + " ");

			// bache to dalo
			if (Curr.left != null) {
				Next_Q.add(Curr.left);
			}
			if (Curr.right != null) {
				Next_Q.add(Curr.right);
			}
			if (Curr_Q.isEmpty()) {
//				System.out.println(Curr_Q);
//				System.out.println(Next_Q);

				Curr_Q = Next_Q;
				Next_Q = new LinkedList<Node>();
				System.out.println();
			}

		}
	}

	private void create_lvl(int[] lvl) {
		Queue<Node> Q = new LinkedList<Node>();

		// Initialize Q
		int idx = 0;
		root = new Node(lvl[idx]);
		idx++;
		Q.add(root);

		while (!Q.isEmpty() && idx < lvl.length) {
			Node Curr = Q.poll();
			// Left child create karo and connect karo.
			if (lvl[idx] != -1) {
				Curr.left = new Node(lvl[idx]);
				Q.add(Curr.left);
			}
			idx++;

			// Right child create karo and connect karo.
			if (lvl[idx] != -1) {
				Curr.right = new Node(lvl[idx]);
				Q.add(Curr.right);
			}
			idx++;
		}
	}

	private Node create_in_pre(int[] in, int in_s, int in_e, int[] pre, int pre_s, int pre_e) {
		if (in_s > in_e || pre_s > pre_e) {
			return null;
		}
//		print(in,in_s,in_e);
//		print(pre,pre_s,pre_e);
//		System.out.println("//////////////////////////");

//		find the root node!!
		int found = -1;
		int count = 0;
		for (int i = in_s; i <= in_e; i++) {

			if (in[i] == pre[pre_s]) {
				found = i;
				break;
			}
			count++;
		}
		Node n = new Node(pre[pre_s]);

		n.left = create_in_pre(in, in_s, found - 1, pre, pre_s + 1, pre_s + count);
		n.right = create_in_pre(in, found + 1, in_e, pre, pre_s + count + 1, pre_e);

		return n;
	}

	public static void print(int[] arr, int s, int e) {
		for (int i = s; i <= e; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
