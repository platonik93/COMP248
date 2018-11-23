
public class LetsPlay {

	
	static Garden Mygarden;
	
	static Dice Mydice;
	
	public static void main(String[] args) {
		
		Mygarden = new Garden();
		
		Mydice = new Dice();
		System.out.println(Mygarden.toString());
		
		
		System.out.println(Mydice.rollDice());
		
		
		

	}

}
