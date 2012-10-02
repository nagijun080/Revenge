import java.util.Random;


public class MyLife {

	private final static Integer NUM = 4;
	
	public static void main(String[] args) {
		Person ore = new Person("‰´—l");
		TaxiCorp taxi = new TaxiCorp();
		for (int i = 0;i < NUM;i++) {
			Driver dri = taxi.pickUp();
			dri.ride(ore);
			dri.handling(MyLife.singou());
			
			System.out.println("\n");
		}
	}
	
	public static TrafficSignal singou() {
		Random ran =  new Random();
		Integer i = ran.nextInt(3);
		switch(i) {
		case 0:
			return TrafficSignal.RED;
		case 1:
			return TrafficSignal.YELLOEW;
		default:
			return TrafficSignal.BLUE;
		}
	}
}
