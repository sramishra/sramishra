package com.promtionEngine.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {

		// Taking input SKU and its unit number from user
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
		System.out.println("Enter no of SKU :\n");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter SKU :\n");
			sku.add(sc.next());
			System.out.println("Enter units of :\n" + sku);
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
			int val1 = (m.get("A") / 3) * 130;// .add
			int val2 = ((m.get("A") % 3) * unitprice.get("A"));
			orderValue_A = val1 + val2;
			System.out.println("Value is :" + orderValue_A);
		}

		// Active Promotion Logic for B
		if (m.get("B") != 0) {
			int val1B = ((m.get("B") / 2) * 45);// .add
			int val2B = ((m.get("B") % 2) * unitprice.get("B"));
			orderValue_B = val1B + val2B;
			System.out.println("Value is :" + orderValue_B);
		}
		//Active Promotion Logic for C and D
				int valC = unitprice.get("C");
				int valD = unitprice.get("D");
				int orderValue_CD=0;
				int orderValue_C=0;
				int orderValue_D=0;
				if(m.get("C") != 0 & m.get("D") != 0  )
				{
				 orderValue_CD = 30;
				 if(m.get("C") == m.get("D"))
				 {
					 orderValue_CD = 30*(m.get("C"));
				 }
				 else if(m.get("C") > m.get("D")) {
					 orderValue_CD = ((m.get("D")*30)+((m.get("C") - m.get("D"))*valC));
				 }
				 else
					 orderValue_CD = ((m.get("C")*30)+((m.get("D") - m.get("C"))*valD)); 
				}
				else{
					orderValue_C = m.get("C") * unitprice.get("C");
					orderValue_D = m.get("D") * unitprice.get("D");
					}
				System.out.println("Value C is :" +orderValue_C);
				System.out.println("Value D is :" +orderValue_D);
				System.out.println("Value CD is :" +orderValue_CD);
				int totalOrderValue=orderValue_A+orderValue_B+orderValue_C+orderValue_D+ orderValue_CD;
				System.out.println("Total Order Value is " + totalOrderValue);
				return totalOrderValue;


	}
}
