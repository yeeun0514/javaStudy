/**
 * Stream
 * Collector joining
 */
package streamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream07 {

	public static void main(String[] args) {
		List<Product> productList = Arrays.asList(
				new Product("apple", 23),
				new Product("banana", 20),
				new Product("lemon", 10),
				new Product("kiwi", 32),
				new Product("orange", 43));
		
		// Collectors to List
		List<String> nameList = productList.stream()
				.map(Product::getName)
				.collect(Collectors.toList());
		
		nameList.stream().forEach(System.out::println);
		
		// Collectors joining
		String listToString1 = productList.stream()
				.map(Product::getName)
				.collect(Collectors.joining());
		
		System.out.println("listToString1 : " + listToString1);
		
		String listToString2 = productList.stream()
				.map(Product::getName)
				.collect(Collectors.joining(" "));
		
		System.out.println("listToString2 : " + listToString2);
		
		String listToString3 = productList.stream()
				.map(Product::getName)
				.collect(Collectors.joining(", ", "<", ">"));
		
		System.out.println("listToString3 : " + listToString3);
		
	}

}
