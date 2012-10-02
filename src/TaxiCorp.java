import java.util.Random;


public class TaxiCorp{
	
	private Integer ran;
	
	public Driver pickUp () {
		Random md = new Random();
		ran = md.nextInt(2);
		
		if(ran == 0) {
			return new MasterDriver();
		} else {
			return new PonkotsuDriver();
		}
	}
}
