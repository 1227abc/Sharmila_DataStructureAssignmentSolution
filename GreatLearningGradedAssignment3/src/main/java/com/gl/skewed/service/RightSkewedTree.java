package com.gl.skewed.service;

import com.gl.skewed.model.Node;

public class RightSkewedTree {

	public static void InOrder(Node root) {
		if (root == null)
			return;
		else {
			InOrder(root.left);
			System.out.println(root.data + " ");
			InOrder(root.right);
		}
	}

	public static void rightSkew(Node root) {

		if (root == null)
			return;
		else {

			rightSkew(root.right);
		}

	}

}
