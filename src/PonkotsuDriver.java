
public class PonkotsuDriver extends Driver {

	@Override
	public void checkAround() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		super.checkAround();
		
		System.out.println("�O��OK�A���i��");
		System.out.println("�����ƃV�[�g�x���g�Y��Ă�");
	}

	@Override
	public void ride(Person human) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		super.ride(human);
		
		System.out.println("���������ǂ�ǂ�I");
	}

	@Override
	public void handling(TrafficSignal color) {
			if (TrafficSignal.RED.equals(color)) {
				System.out.println("�ԐM�����~�܂낤");
			} else if (TrafficSignal.YELLOEW.equals(color)) {
				System.out.println("������A�������悤");
			} else {
				System.out.println("���A�悵���M���悤");
			}
		
	}

}
