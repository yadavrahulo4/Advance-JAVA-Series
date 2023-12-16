package yadavrahuhlo4.javaSeries.Multithreading;

 class ThreadDemo {

	public static void main(String[] args) {
		int n = 10; // total no. of threads
		for (int i = 0; i < n; i++) {

		
		Thread1 thread1 = new Thread1();
		thread1.start();

		Thread thread2 = new Thread(new Thread2());
		thread2.start();
		}
	}
}
