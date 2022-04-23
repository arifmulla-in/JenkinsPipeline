package com.jenkins.training;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addTest() {

		SampleCalculator calculator = new SampleCalculator();
		assertEquals(10, calculator.add(5, 5));
	}
	
	@Test
	public void subTest() {

		SampleCalculator calculator = new SampleCalculator();
		assertEquals(10, calculator.sub(15, 5));
	}

}
