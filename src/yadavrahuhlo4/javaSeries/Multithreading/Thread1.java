package yadavrahuhlo4.javaSeries.Multithreading;

 class Thread1 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Thread1 is running ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occured ");
			e.printStackTrace();
		}
	}
}
