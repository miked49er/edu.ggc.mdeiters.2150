
package edu.ggc.mdeiters.Searches;

import java.util.Arrays;
import java.util.Random;

/** Class: SearchTester
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Apr 16, 2015
 * 
 * Class Description: TODO
 * 
 * Purpose: TODO
 * 
 */
public class SearchTester {

	public int linear(int[] nums, int searchNum) {

		int found = -1;

		for (int i = 0; found == -1 && i < nums.length; i++) {

			if (nums[i] == searchNum) {

				found = i;
			}
		}

		return found;
	}

	public int binary(int[] nums, int searchNum) {

		int found = -1;
		int lo = 0;
		int hi = nums.length - 1;
		int mid = nums.length / 2;

		while (found == -1 && lo <= hi) {

			if (nums[mid] < searchNum) {

				lo = mid + 1;
				mid = (hi + lo)/2;
			}
			else if (nums[mid] > searchNum) {

				hi = mid - 1;
				mid = (hi + lo)/2;
			}
			else if (nums[mid] == searchNum) {
				
				found = mid;
			}
		}

		return found;
	}

	/** Method: main 
	 * @param args
	 * Method Description: TODO
	 */
	public static void main(String[] args) {

		SearchTester st = new SearchTester();

		int[] nums = new int[1000];

		Random rand = new Random();

		for (int i = 0; i < nums.length; i++) {

			nums[i] = rand.nextInt(1000) + 1;
		}

		System.out.println(st.linear(nums, 537));
		Arrays.sort(nums);
		System.out.println(st.binary(nums, 537));
	}

}
