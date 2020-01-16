import java.util.Arrays;

public class GreedyTester {
	public static void main(String[] args) {
		
		// Each index represents a single homework. 
		// In the example below, homework zero has weight 23 and deadline t=3.
		// Each homework takes 1 hour
		int[] weights = new int[] {23, 60, 14, 25, 7}; 
		int[] deadlines = new int[] {3, 1, 2, 1, 3};
		int m = weights.length;
		
		//This is the declaration of a schedule of the appropriate size
		HW_Sched schedule =  new HW_Sched(weights, deadlines, m);
		
		//This call organizes the assignments and outputs homeworkPlan
		int[] res = schedule.SelectAssignments();
		System.out.println(Arrays.toString(res));
	}
		
}
