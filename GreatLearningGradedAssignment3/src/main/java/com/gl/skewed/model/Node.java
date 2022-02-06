package com.gl.skewed.model;

public class Node {
	public int data;
	public Node left, right = null;

	public Node(int i) {
		this.data = i;
		this.left = null;
		this.right = null;
	}

}
