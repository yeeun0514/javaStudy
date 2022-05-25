/**
 * 5/7 정보처리기사 실기 소수 찾기 문제
 * ** 자바로 변환함
 */
package etcPractice;

public class Prime {

	public static int isPrime(int number){
		for(int i=2; i<number; i++){
			if(number % i == 0)
				return 0;
		}
		return 1;
	}
	
	public static void main(String[] args) {
		int number = 13195, max_div = 0, i;
		for(i=2; i< number; i++){
			if(isPrime(i) == 1 && number %i == 0){
				max_div = i;
			}
		}
		
		System.out.printf("%d", max_div);
		
	}

}
