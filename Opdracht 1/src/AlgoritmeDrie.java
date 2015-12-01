
public class AlgoritmeDrie {

	private static int[] algorithmThree;
	
	public static void main(String[] args) {

		//10x uitvoeren van de algoritme
		for(int i = 0; i < 10; i++) {
			long milli1 = System.currentTimeMillis();
			int[] algoriteOne = fillArray(80000000);
			long milli2 = System.currentTimeMillis();
			System.out.println("Test " + (i+1) + " milis: " + (milli2 - milli1));
		}
	}

	/**
	 * Random getal genereren
	 * @param i int
	 * @param j int
	 * @return random getal
	 */
	public static int randInt(int i, int j) {
		return (int) (Math.random() * (j - i));
	}
	
	/**
	 * Array vullen met getallen
	 * @param N grootte van de lijst
	 * @return lijst met getallen
	 */
	public static int[] fillArray(int N) {
		algorithmThree = new int[N];
		for(int i = 0; i < N; i++) {
			algorithmThree[i] = i;
			swap(algorithmThree[i], algorithmThree[randInt(0,i)]);
		}
		
		return algorithmThree;
	}
	
	/**
	 * Positie wisselen van 2 getallan
	 * @param a1 int
	 * @param b1 int
	 */
	public static void swap(int a1, int b1) {		
		int temp = algorithmThree[a1];
		algorithmThree[a1] = algorithmThree[b1];
		algorithmThree[b1] = temp;
	}
}
