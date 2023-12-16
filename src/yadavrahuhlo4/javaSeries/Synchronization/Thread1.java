package yadavrahuhlo4.javaSeries.Synchronization;

public class Thread1 extends Thread {
	MathUitls obj;

	public Thread1(MathUitls obj) {
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
		//	obj.getMultiples(2);   //random input not synchronized
			obj.getMultiples_synchronized(2);//synchronized 
		//	obj.getMultiples_synchronizedBlock(2);//  "
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occured ");
			e.printStackTrace();
		}
	}

}
