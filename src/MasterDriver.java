
public class MasterDriver extends Driver{

	@Override
	public void checkAround() {
		// TODO 自動生成されたメソッド・スタブ
		super.checkAround();
		
		System.out.println("バックミラーOK");
		System.out.println("シートベルトOK");
		System.out.println("前方OK");
		System.out.println("後方OK");
		System.out.println("前方OK");
	}

	@Override
	public void startEngine() {
		// TODO 自動生成されたメソッド・スタブ
		super.startEngine();
		
		System.out.println("慎重にしよう");
	}

	
}
