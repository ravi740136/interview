package javaclasses.main;

public class Thread2 implements Runnable {
	public void run() {
		String name = Thread.currentThread().getName();
				for (int i = 1; i<10; i++){
					System.out.println(name + " "+i);
					try {
						Thread.sleep(1000l);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}		

}
