/**
 * Stream distinct
 * object
 */
package streamPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream04 {

	public static void main(String[] args) {
		Employee e1 = new Employee("Yeeun");
		Employee e2 = new Employee("Yeeun");
		Employee e3 = new Employee("Yoon");
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		// Employee 클래스에서 equals와 hashCode를 override 해야 distinct()가 동작한다.
		
		int size = employees.stream().distinct().collect(Collectors.toList()).size();
		System.out.println(size);
	}

}