package streamPractice;

public class FunctionalInterfaceSupplier {

	@FunctionalInterface
	public interface Supplier<T> {
		T get();
	}

	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Hello~!";
		System.out.println(supplier.get());
	}

}
