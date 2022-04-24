package streamPractice;

import java.util.Objects;

public class FunctionalInterfaceFunction {

	public static void main(String[] args) {
		Function<String, Integer> function = str -> str.length();
		int result = function.apply("Hello World");
		System.out.println(result);
	}
	
	@FunctionalInterface
	public interface Function<T, R> {
		R apply(T t);
		
		default <V> Function<V, R> compose(Function<? super V, ? extends T> before) {
			Objects.requireNonNull(before);
			return (V v) -> apply(before.apply(v));
		}
		
		default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
			Objects.requireNonNull(after);
			return (T t) -> after.apply(apply(t));
		}
		
		static <T> Function<T, T> identity() {
			return t -> t;
		}
	}

}
