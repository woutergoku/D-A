
public class Apl {

	public static void main(String[] args) {
		
		//Tien keer uitvoeren van de algortime
		for(int i = 0; i < 10; i++) {
			long milli1 = System.currentTimeMillis();
			int[] algoriteOne = fillArray(100000);
			long milli2 = System.currentTimeMillis();
			System.out.println("Test " + (i+1) + " milis: " + (milli2 - milli1));
		}
		
	}
	
	/**
	 * Random getal genereren tussen 2 getallen
	 * @param i int
	 * @param j int
	 * @return een getal tussen de meegegeven getallen
	 */
	public static int randInt(int i, int j) {
		return (int) (Math.random() * (j - i));
	}
	
	/**
	 * Vult een array met getallen
	 * @param N Grootte van de array
	 * @return een array met ongesorteerde getallen
	 */
	public static int[] fillArray(int N) {
		int[] myArray = new int[N];
		
		for(int i = 0; i < N; i++) {
			
			int generatedNumber = 0;
			boolean test = true;
			while(test) {
				generatedNumber = randInt(0, (N));
				if(!numberExists(generatedNumber, myArray, i)) {
					test = false;
				}
			}
			
			myArray[i] = generatedNumber;
		}
		
		return myArray;
	}

	/**
	 * Controleert of een getal al bestaat in de array
	 * @param c getal die gecontroleerd moet worden
	 * @param intArray array waar in gekeken moet worden
	 * @param l grootte van de lijst
	 * @return true als getal bestaat anders false.
	 */
	public static boolean numberExists(int c, int[] intArray, int l) {
		for(int i = 0; i <= (l - 1); i++) {
			if(intArray[i] == c) {
				return true;
			}
		}
		
		return false;
	}

}
