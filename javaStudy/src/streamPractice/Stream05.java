/**
 * stream peek
 */
package streamPractice;

import java.util.Arrays;

public class Stream05 {

	public static void main(String[] args) {
		int[] intArray = {1, 3, 5, 7, 9};
		int sum = Arrays.stream(intArray).peek(System.out::println).sum();
		System.out.println(sum);
	}
}
