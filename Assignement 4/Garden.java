
public class Garden {

	private char[][] Garden;
	private Object countPossibleFlowers;

	public Garden() {

		this.Garden = new char[3][3];

		initializedGarden(3, 3);

	}

	public Garden(int row, int coloumn) {

		this.Garden = new char[row][coloumn];

		initializedGarden(row, coloumn);

	}

	private void initializedGarden(int row, int coloumn) {

		for (int r = 0; r < row; r++) {

			for (int c = 0; c < coloumn; c++)
				Garden[r][c] = '-';

		}
	}

	// Return the content of a location
	public char getInLocation(int r, int c) {

		return Garden[r][c];

	}

	// Plant a flower
	public void plantFlower(int r, int c) {

		this.Garden[r][c] = 'f';

	}

	public void plantTree(int r, int c) {

		this.Garden[r][c] = 't';
		this.Garden[r + 1][c] = 't';
		this.Garden[r][c + 1] = 't';
		this.Garden[r + 1][c + 1] = 't';
	}

	public void removeFlower(int r, int c) {

		this.Garden[r][c] = '-';

	}

	public int countPossibleTress() {

		int count = 0;

		for (int r = 0; r < this.Garden[0].length; r++)

			for (int c = 0; c < this.Garden[1].length; c++)

				if (r <= (this.Garden[0].length - 1) && c <= (this.Garden[0].length - 1))
					if (this.Garden[r][c] == '-' && this.Garden[r + 1][c] == '-' && this.Garden[r][c + 1] == '-'
							&& this.Garden[r + 1][c + 1] == '-')
						count++;

		return count;
	}

	public int countPossibleFlowers() {
		int count = 0;

		for (int r = 0; r < this.Garden[0].length; r++)

			for (int c = 0; c < this.Garden[1].length; c++)

				if (Garden[r][c] == '-')
					count += 1;
		return count;

	}

	
	public boolean gardenFull() {
		
		if (countPossibleFlowers.count == 0)
			return false;
		
		else 
			return true;
			
		
	}
	
	
	
	
}
