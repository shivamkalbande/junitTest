package testing;

public class JunitTesting {
	public int square(int i) {
		return i*i;
	}
	
	public int countA(String word) {
		int count  = 0;
		for(int x=0; x < word.length(); x++) {
			if(word.charAt(x)=='a' || word.charAt(x)=='A') {
				count++;
			}
		}
		return count;
	}


}