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
	public static int totalOrderValue(HashMap<String, Integer> m ,HashMap<String, Integer> unitprice ) {
		 int orderValue_A =0;
		 int orderValue_B=0;
		 //Active Promotion Logic for A
		 if(m.get("A") != 0){
		 int val1 =(m.get("A")/3) *130;//.add
		 int val2 =((m.get("A")%3)*unitprice.get("A"));
		 orderValue_A = val1+val2;
		System.out.println("Value is :" +orderValue_A);
		 }
		

		
		return 0;
		
	}
}
