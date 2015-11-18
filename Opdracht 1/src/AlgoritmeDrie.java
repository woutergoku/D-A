
public class AlgoritmeDrie {

	private static int[] algorithmThree;
	
	public static void main(String[] args) {

		fillArray(6);
		for(int i : algorithmThree) {
			System.out.println("["+ i +"]");
		}
	}

	public static int randInt(int i, int j) {
		return (int) (Math.random() * (j - i));
	}
	
	public static void fillArray(int N) {
		algorithmThree = new int[N];
		for(int i = 0; i < N; i++) {
			algorithmThree[i] = i;
			swap(algorithmThree[i], algorithmThree[randInt(0,i)]);
		}
	}
	
	public static void swap(int a1, int b1) {		
		int temp = algorithmThree[a1];
		algorithmThree[a1] = algorithmThree[b1];
		algorithmThree[b1] = temp;
	}
}
