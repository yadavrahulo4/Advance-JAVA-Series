package yadavrahuhlo4.javaSeries.generics;

public class GenericClass<T> {

	T value;

	public GenericClass(T obj) {
		// TODO Auto-generated constructor stub
		this.value = obj;
	}

	public T getvalue() {
		return value;
	}

	public void setvalue(T value) {
		this.value = value;
	}

	public static void main(String[] args) {

		// here, we can use different generic / user-defined Type
		GenericClass<String> genericClassobj1 = new GenericClass<>("yadavrahulo4");
		System.out.println(genericClassobj1);
		GenericClass<Integer> genericClassobj2 = new GenericClass<>(2);
		System.out.println(genericClassobj2);
	}
}
