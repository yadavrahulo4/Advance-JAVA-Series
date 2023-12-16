package yadavrahuhlo4.javaSeries.Multithreading;

 class Thread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method 
		try {
			System.out.println("Thread 2 is running ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occured in thread 2");
			e.printStackTrace();
		}
	}

}
