package yadavrahuhlo4.javaSeries.Autoboxing;

public class Autoboxing {
 public static void main(String[] args) {
	 int a=10;
	 System.out.println("Value before autu-boxing"+a);
	 
	 Integer integer= Integer.valueOf(a); //Autoboxing
	 System.out.println("Value after autu-boxing" +integer);
	 
	 int b=integer;//Un-Boxing 
	 System.out.println("Value after autu-Unboxing");
	 
	
}

}
