package yadavrahuhlo4.javaSeries.generics;

public class GenericMethodDemo {

	public <T> T genericMethod(T value) {
		// code structure
		//System.out.println(value);
		return value;
	}

	public static void main(String[] args) {

		GenericMethodDemo generic = new GenericMethodDemo();
		
		String str=generic.genericMethod("yadavrahulo4");
		
		int r=generic.genericMethod(2);
		
		System.out.println(str);
		System.out.println(r);

	}

}
