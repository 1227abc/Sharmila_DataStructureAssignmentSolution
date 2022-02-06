package com.gl.building.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BuildingSkyScraper {

	public void buildSkyScraper(int max, int n, ArrayList<Integer> list) {

		Stack<Integer> stack = new Stack<Integer>();

		System.out.println("The order of construction is as follows");

		for (int i = 0, day = 1; i < n; i++) {
			System.out.println();
			System.out.println("Day : " + day);
			if (max == list.get(i)) {
				System.out.print(max);
				max = list.get(i) - 1;
			} else {
				stack.add(list.get(i));
				Collections.sort(stack, Collections.reverseOrder());
			}

			if (!stack.isEmpty()) {
				for (int j = 0; j < stack.size(); j++) {

					if (max == stack.get(j)) {
						System.out.print(" " + max);
						max = stack.get(j) - 1;

					}

				}
			}

			day++;
		}
	}

}
