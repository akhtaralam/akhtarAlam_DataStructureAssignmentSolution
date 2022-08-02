package com.greatlearning.driverBST;

import com.greatlearning.transactionBST.CompleteBST;
import com.greatlearning.transactionBST.Node;

public class Driver {

	public static void main(String[] args) {

		CompleteBST tree = new CompleteBST();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);
//utility method to transform BST to skewed tree
		tree.processBST(tree.node);
//utility method to print the transformed data
		tree.traverse(tree.newHead);
	}

}
