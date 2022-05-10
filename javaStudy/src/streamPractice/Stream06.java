/**
 * 원시 Stream <-> Stream
 */
package streamPractice;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream06 {

	public static void main(String[] args) {
		// IntStream -> Stream<Integer>
		IntStream.range(1, 5).mapToObj(i -> "a" + i).forEach(System.out::print);
		
		System.out.println();
		
		// Stream<Double> -> IntStream -> Stream<String>
		Stream.of(1.0, 2.0, 3.0)
			.mapToInt(Double::intValue)
			.mapToObj(i -> "b" + i)
			.forEach(System.out::println);
	}

}
