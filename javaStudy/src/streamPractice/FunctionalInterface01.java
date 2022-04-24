/**
 * functional interface practice
 * 사용 예제
 */
package streamPractice;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface01 {

	public static void main(String[] args) {
		
		// Supplier
		Supplier<String> supplier = () -> "Hello World!";
		System.out.println(supplier.get());
		
		// Consumer
		Consumer<String> consumer = (str) -> System.out.println(str.split(" ")[0]);
		consumer.andThen(System.out::println).accept("Hello World!!");
		
		// Function
		Function<String, Integer> function = str -> str.length();
		function.apply("Hello World!!!");
		
		// Predicate
		Predicate<String> predicate = (str) -> str.equals("Hello World!!!!");
		predicate.test("Hello World!!!!");
	}

}
