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
public class TestCalculateWHIP {
	BaseballStatCalculator bsc = new BaseballStatCalculator();
	protected int hitsAllowed, walksAllowed, inningsPitched;
	String expected, actual;
	
	@Before
	public void setUp() throws Exception {
		hitsAllowed = 9;
		walksAllowed = 4;
		inningsPitched = 8;
	}

	@Test
	public void testCalculateWHIP() {
		expected = "1.625";
		actual = bsc.calculateWHIP(hitsAllowed, walksAllowed, inningsPitched);
		assertEquals(expected, actual);
	}
	@Test
	public void testWHIPNegativeValueForHits() {
		hitsAllowed = -1;
		expected = "Invalid entry for one of the following entries: hits, walks, innings pitched";
		actual = bsc.calculateWHIP(hitsAllowed, walksAllowed, inningsPitched);
		assertEquals(expected, actual);
	}
	@Test
	public void testWHIPNegativeValueForWalks() {
		walksAllowed = -1;
		expected = "Invalid entry for one of the following entries: hits, walks, innings pitched";
		actual = bsc.calculateWHIP(hitsAllowed, walksAllowed, inningsPitched);
		assertEquals(expected, actual);
	}
	@Test
	public void testWHIPNegativeValueForInnings() {
		inningsPitched = -1;
		expected = "Invalid entry for one of the following entries: hits, walks, innings pitched";
		actual = bsc.calculateWHIP(hitsAllowed, walksAllowed, inningsPitched);
		assertEquals(expected, actual);
	}

}
