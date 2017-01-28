package stopwatch;

/**
 * Test timing of the runnable object.
 * @author Pappim Pipatkasrira
 * @version 28.01.2017
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
