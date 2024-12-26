package EnumsBeingUsed;


import EnumsBeingUsed.Coffee.CoffeeSize;

public class CoffeeTest1{
	
	public static void main(String[] args) {
		
		Coffee c = new Coffee();
		
		c.size=CoffeeSize.Big;
		
		System.out.println(c.size);
	}
}
