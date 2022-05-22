/**
 * Stream FlatMap
 * Object List 
 */
package streamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Stream12 {

	public static void main(String[] args) {
		List <Student> students = Arrays.asList(
				new Student(80, 90, 75),
				new Student(70, 100, 75),
				new Student(85, 90, 85),
				new Student(80, 100, 90));
		
		students.stream().flatMapToInt(student ->
				IntStream.of(student.getKor(), student.getEng(), student.getMath()))
				.average()
				.ifPresent(avg -> System.out.println(Math.round(avg * 10) / 10.0));
		
	}

}

class Student {
	private int kor;
	private int eng;
	private int math;
	
	public Student(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}
	
}