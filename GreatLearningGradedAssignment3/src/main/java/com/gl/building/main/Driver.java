package com.gl.building.main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import com.gl.building.service.BuildingSkyScraper;

public class Driver {
	static int max = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		int n = scan.nextInt();
		max = n;

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			System.out.println("enter the floor size given on day : " + i);
			list.add(scan.nextInt());
		}
		BuildingSkyScraper building = new BuildingSkyScraper();
		building.buildSkyScraper(max, n, list);
	}

}
