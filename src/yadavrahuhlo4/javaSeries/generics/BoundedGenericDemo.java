package yadavrahuhlo4.javaSeries.generics;

interface Transport {
}

interface WaterTransport extends Transport {
}

class ship implements WaterTransport {

}

interface RoadTransport extends Transport {
}

class Car implements RoadTransport {
}

class bike implements RoadTransport {
}

public class BoundedGenericDemo<T extends RoadTransport> {
	private T value;

	public BoundedGenericDemo(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoundedGenericDemo<Car> onj1 = new BoundedGenericDemo<>(new Car()); // OK
		BoundedGenericDemo<bike> obj2 = new BoundedGenericDemo<>(new bike()); // OK
		/* Error*/
		// BoundedGenericDemo<ship> obj3 = new BoundedGenericDemo<>(new ship());

		/*
		 * Error Cause :- as our class is bounded using generic concept & it only
		 * accepts type parameters that are subclasses of "BoundedGenericDemo".( ie.
		 * only subclasses of class extended with generic <T> are allowed)
		 * 
		 */

	}

}
