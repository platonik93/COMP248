
public class Dice {

	private int dice1;
	private int dice2;
	
	
	
    
    public Dice() {
        this.dice1 = 0;
        this.dice2 = 0;
        
    }
	
	public int rollDice() {
		
		
		this.dice1 = (int)(Math.random()*7);
		this.dice2 = (int)(Math.random()*7);
		
		int sum = dice1 + dice2;
		
		return sum;
	}
	
	public int getDice1() {
		return dice1;
	}
	public void setDice1(int dice1) {
		this.dice1 = dice1;
	}
	public int getDice2() {
		return dice2;
	}
	public void setDice2(int dice2) {
		this.dice2 = dice2;
	}

	
	
}
