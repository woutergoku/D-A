
public class AlgoritmeTwee {

	public static void main(String[] args) {
		int[] algoriteOne = fillArray(6);
		
		for(int i : algoriteOne) {
			System.out.println("["+ i +"]");
		}
	}
	
	public static int randInt(int i, int j) {
		return (int) (Math.random() * (j - i));
	}
	
	public static int[] fillArray(int N){
		int[] algorithmTwo = new int[N];
		boolean[] used = new boolean[N];
		
		int generatedNumber = 0;
		generatedNumber = randInt(0, N);
		for(int i = 0; i < N; i++){
			while(used[generatedNumber]){
				generatedNumber = randInt(0, N);
			}
			algorithmTwo[i] = generatedNumber;
			used[generatedNumber] = true;
		}
		
		return algorithmTwo;
	}
}
