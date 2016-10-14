package javaclasses.main;

public class Consumer implements Runnable{
	Box b;
	String message;
	
	public Consumer(Box b){
		this.b = b;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			message = b.take();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while (!(message.equals("done"))){
		try {
			System.out.println(message);
			Thread.sleep(1000l);
			message = b.take();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
