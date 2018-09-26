package Algorithm;

import java.util.Scanner;

/*
 *   循环数树的节点
 */
public class NowWhere {
	class Node {
		public int v;
		public Node left;
		public Node right;
	}

	class Tree {
		public Node node1;
		public Node node2;
		public Node node3;
		public Node node4;
		public Node node5;

		public Tree() {
			node1 = new Node();
			node2 = new Node();
			node3 = new Node();
			node4 = new Node();
			node5 = new Node();

			node1.v = 1;
			node1.left = node2;
			node1.right = node3;

			node2.v = 2;
			node2.left = node3;
			node2.right = node4;

			node3.v = 3;
			node3.left = node4;
			node3.right = node5;

			node4.v = 4;
			node4.left = node5;
			node4.right = node1;

			node5.v = 5;
			node5.left = node1;
			node5.right = node2;

		}
	}

	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
         
	}
}
