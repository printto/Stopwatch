package stopwatch;

/**
 * Append chars to a string.
 */

public class AppendToString implements Runnable {

	final char CHAR = 'a';
	int count = 0;
	
	public AppendToString(int count){
		this.count = count;
		System.out.printf("Append %,d chars to String\n", count);
	}

	public void run(){
		String result = ""; 
		int k = 0;
		while(k++ < count) {
			result = result + CHAR;
		}
		System.out.println("final string length = " + result.length());
	}

}
