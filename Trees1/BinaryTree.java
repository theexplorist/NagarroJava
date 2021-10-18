package Trees1;

import java.util.Scanner;

public class BinaryTree {

	private Scanner sc = new Scanner(System.in);

	private class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root; // null

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		this.root = build(null);
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

		if(root == null) {
			return 0;
		}
		
		int recLh = maxDepth(root.left);
		int recRh = maxDepth(root.right);
		
		int maxH = Math.max(recLh, recRh);
		int meraH = maxH + 1;
		return meraH;
	}
	
public boolean hasPathSum(Node root, int targetSum) {
        
        if(root == null) {
            return false;
        }
        
        if(root.left == null && root.right == null) {//main hun leaf pr -> ek root to leaf path mil gya hai
           int res = targetSum - root.val;
            if(res == 0) {
                return true;
            }
        }
        
        boolean left = hasPathSum(root.left, targetSum - root.val);
        boolean right = hasPathSum(root.right, targetSum - root.val);
        
        return left || right;
    }
}
