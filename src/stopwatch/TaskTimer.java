package stopwatch;

/**
 * Test timing of the runnable object.
 */

public class TaskTimer {

	public static void mesureAndPrint(Runnable r){
		Stopwatch timer = new Stopwatch();
		timer.start();
		r.run();
		timer.stop();
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}
	
}
