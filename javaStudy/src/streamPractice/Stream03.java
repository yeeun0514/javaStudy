/**
 * Stream distinct
 * String array, list
 */
package streamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream03 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Google", "Amazon", "Netflix", "Naver", "Kakao", "Line", "Toss", "Google", "Toss");
		Stream<String> stream1 = list.stream();
		
		stream1.forEach(System.out::print);
		System.out.println();
		
		Stream<String> stream2 = list.stream();
		
		stream2.distinct().forEach(System.out::println);
		
		Stream<String> stream3 = list.stream();
		
		List<String> result = stream3.distinct()
									.collect(Collectors.toList());
		System.out.println(result.size());
		
		
		
	}

}
