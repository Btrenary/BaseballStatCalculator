package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.BaseballStatCalculator;

/**
 * @author Brady Trenary-bbtrenary
 *CIS175 - Fall 2021
 * Sep 6, 2021
 */
public class TestCalculateERA {
	BaseballStatCalculator bsc = new BaseballStatCalculator();
	protected int earnedRuns, inningsPitched;
	String expected, actual;
	
	@Before
	public void setUp() throws Exception {
		earnedRuns = 3;
		inningsPitched = 6;
	}

	@Test
	public void testCalculateERA() {
		expected = "4.5";
		actual = bsc.calculateERA(earnedRuns, inningsPitched);
		assertEquals(expected, actual);
	}
	@Test
	public void testERANegativeValue() {
		earnedRuns = -3;
		expected = "Invalid entry for earned runs and/or innings pitched";
		actual = bsc.calculateERA(earnedRuns, inningsPitched);
		assertTrue(expected == actual);
	}
	@Test
	public void testERANotNull() {
		actual = bsc.calculateERA(earnedRuns, inningsPitched);
		assertNotNull(actual);
	}
}
