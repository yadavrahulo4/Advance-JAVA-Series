package yadavrahuhlo4.javaSeries.Synchronization;

public class MathUitls {
	/* unsynchronized method */
	void getMultiples(int n) {
		for (int i = 0; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/* synchronized method */
	synchronized void getMultiples_synchronized(int n) {
		for (int i = 0; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/* synchronized block */
	void getMultiples_synchronizedBlock(int n) {
		synchronized (this) {
			for (int i = 0; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
