package stopwatch;

/**
 * Add Double objects from an array.
 * @author Pappim Pipatkasrira
 * @version 28.01.2017
 */

public class SumDouble implements Runnable{
	
	int counter = 0;
	Double[] values;
	
	public SumDouble(int counter, int ARRAY_SIZE){
		this.counter = counter;
		this.values = new Double[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new Double(i+1);
	}
	
	public void run(){
		Double sum = new Double(0.0);
		// count = loop counter, i = array index
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum + values[i];
		}
		System.out.println("sum = " + sum);
	}
	
	public String toString(){
		String format = String.format("Sum array of Double objects with count=%,d", counter);
		return format;
	}

}
