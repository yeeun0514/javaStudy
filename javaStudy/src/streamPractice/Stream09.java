/**
 * Stream Collectors 
 * groupingBy(), partitioningBy()
 */
package streamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream09 {

	public static void main(String[] args) {
		List<Product> productList = Arrays.asList(
				new Product("apple", 23),
				new Product("banana", 13),
				new Product("lemon", 10),
				new Product("kiwi", 32),
				new Product("orange", 32));
		
		// group by
		Map<Integer, List<Product>> collectorMapOfLists = productList.stream()
				.collect(Collectors.groupingBy(Product::getAmount));
		
		// partitioning by
		Map<Boolean, List<Product>> mapPartitioned = productList.stream()
				.collect(Collectors.partitioningBy(p -> p.getAmount() > 15));
		
		
		
	}

}
