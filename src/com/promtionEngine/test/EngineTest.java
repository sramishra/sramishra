package com.promtionEngine.test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import com.promtionEngine.logic.Engine;

class EngineTest {

	@Test
	public void testScenarioA() {
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
		int actual = Engine.totalOrderValue(m, unitprice);
		int expected = 100;
		assertEquals(expected,actual);
	}

}
