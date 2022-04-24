package streamPractice;

import java.util.Objects;

public class FunctionalInterfaceConsumer {

	public static void main(String[] args) {
		Consumer<String> consumer = (str) -> System.out.println(str.split(" ")[0]);
		consumer.andThen(System.out::println).accept("Hello World");
	}
	
	@FunctionalInterface
	public interface Consumer<T> {
		
		void accept(T t);
		
		default Consumer<T> andThen(Consumer<? super T> after) {
			Objects.requireNonNull(after);
			return (T t) -> { accept(t); after.accept(t); };
		}
	}

}
