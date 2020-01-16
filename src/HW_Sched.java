import java.util.*;

class Assignment implements Comparator<Assignment>{
	int number;
	int weight;
	int deadline;
	
	
	protected Assignment() {
	}
	
	protected Assignment(int number, int weight, int deadline) {
		this.number = number;
		this.weight = weight;
		this.deadline = deadline;
	}
	
	
	
	/**
	 * This method is used to sort to compare assignment objects for sorting. 
	 * Return -1 if a1 > a2
	 * Return 1 if a1 < a2
	 * Return 0 if a1 = a2 
	 */
	@Override
	public int compare(Assignment a1, Assignment a2) {
		// compare according to weight since we need to optimize weight
		if(a1.weight < a2.weight)
		{
			return 1;
		}
		else if(a1.weight > a2.weight)
		{
			return -1;
		}
		else
		{
			return 0;
		}	
	}
}

public class HW_Sched {
	ArrayList<Assignment> Assignments = new ArrayList<Assignment>();
	int m;
	int lastDeadline = 0;
	
	protected HW_Sched(int[] weights, int[] deadlines, int size) {
		for (int i=0; i<size; i++) {
			Assignment homework = new Assignment(i, weights[i], deadlines[i]);
			this.Assignments.add(homework);
			if (homework.deadline > lastDeadline) {
				lastDeadline = homework.deadline;
			}
		}
		m =size;
	}
	
	
	public void printList(ArrayList<Assignment> pAssignments)
	{
		// helper method to print any ArrayList while building the code
		for(Assignment a : pAssignments)
		{
			System.out.print(a.weight + ",");
			
		}
		System.out.println();
		for(Assignment a : pAssignments)
		{
			System.out.print(a.deadline + ",");
			
		}
		System.out.println();
	}
	
	/**
	 * 
	 * @return Array where output[i] corresponds to the assignment 
	 * that will be done at time i.
	 */
	public int[] SelectAssignments() {
		
		// Sort assignments
		// Order will depend on how we implemented 
		// the compare function (sort according to weight)
		
		Collections.sort(Assignments, new Assignment());
		
		// If schedule[i] has a value -1, it indicates that the 
		// i'th timeslot in the schedule is empty
		int[] homeworkPlan = new int[lastDeadline];
		for (int i=0; i < homeworkPlan.length; i++) {
			homeworkPlan[i] = -1;
		}
		
		
		//we will iterate through the assignments array list
		for(int i = 0; i < Assignments.size(); i++) 
		{
			Assignment currAssignment = Assignments.get(i);
			int assignmentDeadline = currAssignment.deadline;
			int currPos = assignmentDeadline - 1;
			while(currPos > -1)
			{
				if (homeworkPlan[currPos] == -1)
				{
					homeworkPlan[currPos] = currAssignment.number;
					currPos = -1;
				}
				else
				{
					currPos--;
				}
			}
		}
		return homeworkPlan;
	}
}
	



