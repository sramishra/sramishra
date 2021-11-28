package com.promtionEngine.test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import com.promtionEngine.logic.Engine;

class EngineTest {

	@Test
	public void testScenarioA() {
		HashMap<String, Integer> m = new HashMap();
		m.put("A", 1);
		m.put("B", 1);
		m.put("C", 1);
		m.put("D", 0);
		HashMap<String, Integer> unitprice = new HashMap();
		unitprice.put("A", 50);
		unitprice.put("B", 30);
		unitprice.put("C", 20);
		unitprice.put("D", 15);
		int actual = Engine.totalOrderValue(m, unitprice);
		int expected = 100;
		assertEquals(expected,actual);
	}
	@Test
	public void testScenarioB() {
		HashMap<String, Integer> m = new HashMap();
		m.put("A", 5);
		m.put("B", 5);
		m.put("C", 1);
		m.put("D", 0);
		HashMap<String, Integer> unitprice = new HashMap();
		unitprice.put("A", 50);
		unitprice.put("B", 30);
		unitprice.put("C", 20);
		unitprice.put("D", 15);
		int actual = Engine.totalOrderValue(m, unitprice);
		int expected = 370;
		assertEquals(expected,actual);
	}


}
