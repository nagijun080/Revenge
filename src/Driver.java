
public class Driver {

	public void startEngine() {
		
	}
	
	public void checkAround() {
		
	}
	
	public void ride(Person human) {
		System.out.println(human.getName() + "さん乗車しました。");
	
		this.startEngine();
		this.checkAround();
	}
	
	public void handling(TrafficSignal color) {
		if (TrafficSignal.RED.equals(color)) {
			System.out.println("赤信号だ止まろう");
		} else if (TrafficSignal.YELLOEW.equals(color)) {
			System.out.println("黄色だから危ないから、止まろう");
		} else {
			System.out.println("青だ、よし発信しよう");
		}
	}
}
