package yadavrahuhlo4.javaSeries.Synchronization;

public class SynchronizationDemo {

	public static void main(String[] args) {
		MathUitls mathUitls = new MathUitls();
		Thread1 thread1 = new Thread1(mathUitls);
		thread1.start();

		Thread thread2 = new Thread(new Thread2(mathUitls));
		thread2.start();
		/*
		 * a random output will be printed if getMultiple method is not synchronized
		 * 
		 * OUTPUT:_ 0 0 2 3 6 4 9 6 12 8 15 10 // unsynchronized thus we will get random input each time
		 * 
		 * ACTUAL OUTPUT:_ 0 2 4 6 8 10 0 3 6 9 12 15 //synchronized
		 *
		 */
	}

}
