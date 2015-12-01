
public class AlgoritmeTwee {

	public static void main(String[] args) {
		
		//10x uitvoeren van de algoritme
		for(int i = 0; i < 10; i++) {
			long milli1 = System.currentTimeMillis();
			int[] algoriteOne = fillArray(10000000);
			long milli2 = System.currentTimeMillis();
			System.out.println("Test " + (i+1) + " milis: " + (milli2 - milli1));
		}
	}
	
	/**
	 * Random getal genereren
	 * @param i int
	 * @param j int
	 * @return een random getal
	 */
	public static int randInt(int i, int j) {
		return (int) (Math.random() * (j - i));
	}
	
	/**
	 * Array vullen met getallen
	 * @param N grootte van de lijst
	 * @return lijst met getallen
	 */
	public static int[] fillArray(int N){
		int[] algorithmTwo = new int[N];
		boolean[] used = new boolean[N];
		
		int generatedNumber = 0;
		generatedNumber = randInt(0, N);
		for(int i = 0; i < N; i++){
			//Controleert of het gegenereerde getal al is gebruikt
			while(used[generatedNumber]){
				generatedNumber = randInt(0, N);
			}
			algorithmTwo[i] = generatedNumber;
			used[generatedNumber] = true;
		}
		
		return algorithmTwo;
	}
}
