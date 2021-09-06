package model;

/**
 * @author Brady Trenary-bbtrenary
 *CIS175 - Fall 2021
 * Sep 6, 2021
 */
public class Driver {

	public static void main(String[] args) {
		BaseballStatCalculator bsc = new BaseballStatCalculator();
		
		System.out.println(bsc.calculateERA(3, 6));
		System.out.println(bsc.calculateWHIP(5, 1, 4));
		

	}

}
