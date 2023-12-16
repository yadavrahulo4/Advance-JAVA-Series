package yadavrahuhlo4.javaSeries.Synchronization;
import java.util.concurrent.locks.*;
public class Thread2 implements Runnable {
	MathUitls obj;

	public Thread2(MathUitls obj) {
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}

	@Override
	public void run() {
		// TODO Auto-generated method
		try {
			obj.getMultiples(3);   //random input not synchronized
//					obj.getMultiples_synchronized(3);//synchronized 
				//	obj.getMultiples_synchronizedBlock(3);//  "
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occured in thread 2");
			e.printStackTrace();
		}
	}
}
