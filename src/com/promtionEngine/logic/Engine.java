//Problem Statement 1: Promotion Engine
package com.promtionEngine.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {

		
		HashMap<String, Integer> m = new HashMap();
		m.put("A", 0);
		m.put("B", 0);
		m.put("C", 0);
		m.put("D", 0);
		HashMap<String, Integer> unitprice = new HashMap();
		unitprice.put("A", 50);
		unitprice.put("B", 30);
		unitprice.put("C", 20);
		unitprice.put("D", 15);
		ArrayList<String> sku = new ArrayList<String>();
		ArrayList<Integer> unit = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = 1;
		// Taking input SKU and its unit number from user
		System.out.print("Enter total types of SKU ids: "); // ex: if input is 3 =>SKUs are A,B,C
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter SKU :"); // ex: A,B,C..
			sku.add(sc.next());
			System.out.print("Enter units of :" + sku); // ex : 1,2,3..
			unit.add(sc.nextInt());
			m.put(sku.get(0), unit.get(0));
			sku.clear();
			unit.clear();
			System.out.println(m);
		}
		totalOrderValue(m, unitprice);
	}

	public static int totalOrderValue(HashMap<String, Integer> m, HashMap<String, Integer> unitprice) {
		int orderValue_A = 0;
		int orderValue_B = 0;
		// Active Promotion Logic for A
		if (m.get("A") != 0) {
			int val1 = (m.get("A") / 3) * 130;
			int val2 = ((m.get("A") % 3) * unitprice.get("A"));
			orderValue_A = val1 + val2;
			System.out.println("Value of A is :" + orderValue_A);
		}

		// Active Promotion Logic for B
		if (m.get("B") != 0) {
			int val1B = (m.get("B") / 2) * 45;
			int val2B = ((m.get("B") % 2) * unitprice.get("B"));
			orderValue_B = val1B + val2B;
			System.out.println("Value of B is :" + orderValue_B);
		}
		// Active Promotion Logic for C and D
		int valC = unitprice.get("C");
		int valD = unitprice.get("D");
		int orderValue_CD = 0;
		int orderValue_C = 0;
		int orderValue_D = 0;
		if (m.get("C") != 0 & m.get("D") != 0) {
			orderValue_CD = 30;
			if (m.get("C") == m.get("D")) {
				orderValue_CD = 30 * (m.get("C"));
			} else if (m.get("C") > m.get("D")) {
				orderValue_CD = ((m.get("D") * 30) + ((m.get("C") - m.get("D")) * valC));
			} else {
				orderValue_CD = ((m.get("C") * 30) + ((m.get("D") - m.get("C")) * valD));
			}
			System.out.println("Value of C + D is :" + orderValue_CD);
		} else {
			orderValue_C = m.get("C") * unitprice.get("C");
			System.out.println("Value of C is :" + orderValue_C);
			orderValue_D = m.get("D") * unitprice.get("D");
			System.out.println("Value of D is :" + orderValue_D);

		}

		int totalOrderValue = orderValue_A + orderValue_B + orderValue_C + orderValue_D + orderValue_CD;
		System.out.println("Total Order Value is " + totalOrderValue);
		return totalOrderValue;

	}
}
