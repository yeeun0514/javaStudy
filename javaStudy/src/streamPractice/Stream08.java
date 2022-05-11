/**
 * Stream Collectors
 * averagingInt(), summingInt(), summarizingInt()
 */
package streamPractice;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;


public class Stream08 {

	public static void main(String[] args) {
		List<Product> productList = Arrays.asList(
				new Product("apple", 23),
				new Product("banana", 20),
				new Product("lemon", 10),
				new Product("kiwi", 32),
				new Product("orange", 43));
		
		Double averageAmount = productList.stream()
				.collect(Collectors.averagingInt(Product::getAmount));
		
		Integer summingAmount = productList.stream()
				.collect(Collectors.summingInt(Product::getAmount));
		
		Integer summingAmount2 = productList.stream()
				.mapToInt(Product::getAmount)
				.sum();
		
		System.out.println("averageAmount : " + averageAmount);
		System.out.println("summingAmount : " + summingAmount);
		System.out.println("summingAmount2 : " + summingAmount2);
		
		IntSummaryStatistics statistics = productList.stream()
				.collect(Collectors.summarizingInt(Product::getAmount));
		
		System.out.println("IntSummaryStatistics getCount : " + statistics.getCount());
		System.out.println("IntSummaryStatistics getSum : " + statistics.getSum());
		System.out.println("IntSummaryStatistics getAverage : " + statistics.getAverage());
		System.out.println("IntSummaryStatistics getMin : " + statistics.getMin());
		System.out.println("IntSummaryStatistics getMax : " + statistics.getMax());
		
	}

}
