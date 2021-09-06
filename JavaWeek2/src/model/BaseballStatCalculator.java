package model;
import java.text.DecimalFormat;

/**
 * @author Brady Trenary-bbtrenary
 *CIS175 - Fall 2021
 * Sep 6, 2021
 */
public class BaseballStatCalculator {
	final int EARNED_RUN_MULTIPLIER = 9;
	private int earnedRuns;
	private double inningsPitched;
	private int hitsAllowed;
	private int walksAllowed;
	
	public BaseballStatCalculator() {
		
	}
	
	public int getHitsAllowed() {
		return hitsAllowed;
	}

	public void setHitsAllowed(int hitsAllowed) {
		if(hitsAllowed >= 0) {
			this.hitsAllowed = hitsAllowed;
		}
		else {
			throw new IllegalArgumentException("Argument out range");
		}
	}

	public int getWalksAllowed() {
		return walksAllowed;
	}

	public void setWalksAllowed(int walksAllowed) {
		if(walksAllowed >= 0) {
			this.walksAllowed = walksAllowed;
		}
		else {
			throw new IllegalArgumentException("Argument out range");
		}
	}

	public int getEarnedRuns() {
		return earnedRuns;
	}

	public void setEarnedRuns(int earnedRuns) {
		if(earnedRuns >= 0) {
			this.earnedRuns = earnedRuns;
		}
		else {
			throw new IllegalArgumentException("Argument out range");
		}
	}

	public double getInningsPitched() {
		return inningsPitched;
	}

	public void setInningsPitched(double inningsPitched) {
		if(inningsPitched > 0) {
			this.inningsPitched = inningsPitched;
		}
		else {
			throw new IllegalArgumentException("Argument out range");
		}
	}
	
	public String calculateERA(int earnedRuns, double inningsPitched) {
		DecimalFormat df = new DecimalFormat("###.##");
		if(earnedRuns < 0 || inningsPitched <= 0) {
			return "Invalid entry for earned runs and/or innings pitched";
		}
		else {
			double era = (earnedRuns / inningsPitched) * EARNED_RUN_MULTIPLIER;
			return df.format(era);
		}	
	}
	
	public String calculateWHIP(int hitsAllowed, int walksAllowed, double inningsPitched) {
		DecimalFormat df = new DecimalFormat("###.###");
		if(hitsAllowed < 0 || walksAllowed < 0 || inningsPitched <=0) {
			return "Invalid entry for one of the following entries: hits, walks, innings pitched";
		}
		double whip = (hitsAllowed + walksAllowed) / inningsPitched;
		return df.format(whip);
	}
}
