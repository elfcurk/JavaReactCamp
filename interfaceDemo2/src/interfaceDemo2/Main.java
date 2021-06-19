package interfaceDemo2;

public class Main {

	public static void main(String[] args) {
		
		Worker worker=new Worker();
		worker.eat();
		
		Worker worker2=new Worker();
		worker2.pay();
		
		
		OutSourceWorker outSourceWorker=new OutSourceWorker();
		outSourceWorker.work();
		
		Robot robot=new Robot();
		robot.work();
		robot.connect();
		
	}

}
