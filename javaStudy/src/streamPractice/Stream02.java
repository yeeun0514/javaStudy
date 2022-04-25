/*
 * String sort using stream
 * String[], List<String>
 */

package streamPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Stream02 {

	public static void main(String[] args) {
		String[] nameArr = {"IronMan", "Captain", "Hulk", "Thor", "Black Panther", "Spidey", "Black Widow"};
		List<String> nameList = Arrays.asList(nameArr);
		
		Stream<String> arrayStream = Arrays.stream(nameArr);
		Stream<String> nameStream = nameList.stream();
		
		nameStream.sorted().forEach(System.out::println);
		arrayStream.sorted().forEach(System.out::println);
		
		System.out.println("=============== Reverse ===============");
		
		Stream<String> arrayStream2 = Arrays.stream(nameArr);
		Stream<String> nameStream2 = nameList.stream();
		nameStream2.sorted(Comparator.reverseOrder()).forEach(System.out::println);
		arrayStream2.sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
	}

}
