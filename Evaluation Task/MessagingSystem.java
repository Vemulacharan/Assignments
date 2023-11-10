class Message{
	
	private String message;
	private boolean messageSent = false;
	
	public synchronized void sentMessage(String msg) {
		while(messageSent) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		
		message = msg;
		messageSent = true;
		System.out.println("Sent: "+msg);
		notify();
	}
	
	public synchronized void receiveMessage() {
		
		while(!messageSent) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		
		messageSent = false;
		System.out.println("Receive: "+message);
		notify();
	}
}

class SenderThread extends Thread{
	
	private final Message message;
	
	public SenderThread(Message message) {
		this.message = message;
	}
	
	public void run() {
		
		String[] messages = {"Hello", "what are you doing","catch up later", "Bye"};
		
		for(String msg : messages) {
			message.sentMessage(msg);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}


class ReceiveThread extends Thread{
	
	private final Message message;
	
	public ReceiveThread(Message message) {
		this.message = message;
	}
	
	public void run() {
		for(int i=1; i<=4; i++) {
			message.receiveMessage();
		}
	}
	
}

public class MessagingSystem {

	public static void main(String[] args) {
		
		Message m = new Message();
		SenderThread st = new SenderThread(m);
		ReceiveThread rt = new ReceiveThread(m);
		
		st.start();
		rt.start();

	}

}
