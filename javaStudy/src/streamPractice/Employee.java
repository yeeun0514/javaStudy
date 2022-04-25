/**
 * Stream04의 객체 list stream의 distinct 연습을 위한 Employee Class
 */
package streamPractice;

import java.util.Objects;

public class Employee {
	
	private String name;
	
	public Employee(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// stream().distinct()를 사용하기 위해서는 equals와 hashCode를 override 되어있어야 한다.
	
	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return Objects.equals(name, employee.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

}
