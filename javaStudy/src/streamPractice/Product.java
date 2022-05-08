/**
 * Stream07의 collect 연습을 위한 Product Class
 */
package streamPractice;

public class Product {
	private String name;
	
	private int amount;
	
	public Product(String name){
		this.name = name;
	}
	
	public Product(String name, int amount){
		this.name = name;
		this.amount = amount;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAmount(){
		return amount;
	}
}
