import java.util.ArrayList;

/**
 * The runner class that 
 * @author CS125Research
 */
public class Main {

	public static boolean buildSucceeded = false;
	
	public static void main(String[] args) {
		CleanFeedbackData.initialize();
		System.out.printf("Percentage of entries valid: %f%%\nNumber of valid entries: %d\nNumber of entries: %d\n", CleanFeedbackData.percentValid, CleanFeedbackData.numberOfValidEntries, CleanFeedbackData.numberOfEntries);
		System.out.println("======================================================================================\n");
		
		Lecture.initialize();
		
		//Print each lecture object:
		ArrayList<Lecture> lectures = Lecture.lectures;
		for(int j = 0; j < lectures.size(); j++) {
			System.out.println(lectures.get(j));
		}
		
		System.out.printf("Average: %f, Standard Deviation: %f\n", Lecture.mean, Lecture.stdDev);
		System.out.println("Number of lectures: " + lectures.size());
		System.out.println("======================================================================================\n");
		System.out.println("BUILD SUCCEEDED");
		buildSucceeded = true;
	}
}
