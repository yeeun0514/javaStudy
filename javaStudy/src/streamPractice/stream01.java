/*
 * int array calculation
 * max, min, average, sum, count
 */

package streamPractice;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class stream01 {

	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		OptionalInt maxArr = IntStream.of(intArr).max();
		System.out.println("maxArr : " + maxArr.getAsInt());
		
		OptionalInt minArr = IntStream.of(intArr).min();
		System.out.println("minArr : " + minArr.getAsInt());
		
		OptionalDouble avrArr = IntStream.of(intArr).average();
		System.out.println("avrArr : " + avrArr.getAsDouble());
		
		int sumArr = IntStream.of(intArr).sum();
		System.out.println("sumArr : " + sumArr);
		
		long countArr = IntStream.of(intArr).count();
		System.out.println("countArr : " + countArr);
		
		OptionalInt min = IntStream.of(1, 3, 5, 7, 9).min();
		System.out.println(min.getAsInt());
		
		int max = IntStream.of(1, 3, 5, 7, 9).max().orElse(-1);
		System.out.println(max);
		
		IntStream.of(1, 3, 5, 7, 9).average().ifPresent(System.out::println);
		
	}

}
