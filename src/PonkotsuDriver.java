
public class PonkotsuDriver extends Driver {

	@Override
	public void checkAround() {
		// TODO 自動生成されたメソッド・スタブ
		super.checkAround();
		
		System.out.println("前方OK、発進だ");
		System.out.println("おっとシートベルト忘れてた");
	}

	@Override
	public void ride(Person human) {
		// TODO 自動生成されたメソッド・スタブ
		super.ride(human);
		
		System.out.println("いけいけどんどん！");
	}

	@Override
	public void handling(TrafficSignal color) {
			if (TrafficSignal.RED.equals(color)) {
				System.out.println("赤信号だ止まろう");
			} else if (TrafficSignal.YELLOEW.equals(color)) {
				System.out.println("いける、加速しよう");
			} else {
				System.out.println("青だ、よし発信しよう");
			}
		
	}

}
