
public class Apl {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			long milli1 = System.currentTimeMillis();
			int[] algoriteOne = fillArray(20000);
			long milli2 = System.currentTimeMillis();
			System.out.println("Test " + (i+1) + " milis: " + (milli2 - milli1));
		}
		
	}
	
	public static int randInt(int i, int j) {
		return (int) (Math.random() * (j - i));
	}
	
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

	public static boolean numberExists(int c, int[] intArray, int l) {
		for(int i = 0; i <= (l - 1); i++) {
			if(intArray[i] == c) {
				return true;
			}
		}
		
		return false;
	}

}
