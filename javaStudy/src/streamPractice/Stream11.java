/**
 * Stream FlatMap
 * List, Array
 */
package streamPractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream11 {

	public static void main(String[] args) {
		// list인 경우
		List<List<String>> list = Arrays.asList(Arrays.asList("a"), Arrays.asList("b"));
		
		List<String> flatList = list.stream()
				.flatMap(Collection::stream)
				.collect(Collectors.toList());
		
		System.out.println("list : " + list);
		System.out.println("flatList : " + flatList);
		
		// 2차원 배열
		Stream<String[]> strStream = Stream.of(
				new String[] {"a", "b", "c"},
				new String[] {"d", "e", "f"});
		
		Stream<String[]> strStream2 = Stream.of(
				new String[] {"a", "b", "c"},
				new String[] {"d", "e", "f"});
		
		Stream<Stream<String>> stream = strStream.map(Arrays::stream);
		System.out.println(stream.count());
		
		Stream<String> stream2 = strStream2.flatMap(Arrays::stream);
		System.out.println(stream2.peek(System.out::print).count());
		
	}

}
