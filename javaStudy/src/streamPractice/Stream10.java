/**
 * Stream Match
 * anyMatch, allMatch, noneMatch
 */
package streamPractice;

import java.util.Arrays;
import java.util.List;

public class Stream10 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Yeeun", "Yebin", "Yoon", "Han", "Eunhyun");
		
		boolean anyMatch = names.stream()
				.anyMatch(name -> name.contains("Y"));
		
		boolean allMatch = names.stream()
				.allMatch(name -> name.endsWith("n"));
		
		boolean noneMatch = names.stream()
				.noneMatch(name -> name.length() > 10);
		
		System.out.println("anyMatch : " + anyMatch);
		System.out.println("allMatch : " + allMatch);
		System.out.println("noneMatch : " + noneMatch);
		
		names.stream().forEach(System.out::println);
		
	}

}
