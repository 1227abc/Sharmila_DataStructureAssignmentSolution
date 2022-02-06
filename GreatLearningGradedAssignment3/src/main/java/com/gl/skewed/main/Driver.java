package com.gl.skewed.main;

import com.gl.skewed.model.Node;

import com.gl.skewed.service.RightSkewedTree;

public class Driver {

	public static void main(String[] args) {
		Node tree = new Node(50);
		tree.left = new Node(30);
		tree.right = new Node(60);
		tree.left.left = new Node(10);
		tree.left.right = new Node(40);

		RightSkewedTree.rightSkew(tree);
		RightSkewedTree.InOrder(tree);

	}

}
