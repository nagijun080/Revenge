
public class Driver {

	public void startEngine() {
		
	}
	
	public void checkAround() {
		
	}
	
	public void ride(Person human) {
		System.out.println(human.getName() + "�����Ԃ��܂����B");
	
		this.startEngine();
		this.checkAround();
	}
	
	public void handling(TrafficSignal color) {
		if (TrafficSignal.RED.equals(color)) {
			System.out.println("�ԐM�����~�܂낤");
		} else if (TrafficSignal.YELLOEW.equals(color)) {
			System.out.println("���F�������Ȃ�����A�~�܂낤");
		} else {
			System.out.println("���A�悵���M���悤");
		}
	}
}
