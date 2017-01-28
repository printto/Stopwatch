package stopwatch;

/**
 * Add double primatives from an array.
 */

public class SumDoublePrimative implements Runnable {
	
	int counter = 0;
	double[] values;
	
	public SumDoublePrimative(int counter, int ARRAY_SIZE){
		this.counter = counter;
		System.out.printf("Sum array of double primitives with count=%,d\n", counter);
		// create array of values to add before we start the timer
		this.values = new double[ARRAY_SIZE];
		for(int k=0; k<ARRAY_SIZE; k++) values[k] = k+1;
	}
	
	public void run(){
		double sum = 0.0;
		// count = loop counter, i = array index value
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;  // reuse the array when get to last value
			sum = sum + values[i];
		}
		System.out.println("sum = " + sum);
		
	}

}
