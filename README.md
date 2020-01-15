# Greedy_Algorithm-Homework_Scheduler


 ABSTRACT

 As students, we are in a constant race against time to finish homework. We take a multitude of courses simultaneously, and often have a lot on our plate to manage.

 This repository takes a stab at that very problem of coming up with a homework plan that will yield the most optimal result, that is, according to the greedy strategy.

 Taking into account the weight along with the deadline of assignments, we will implement the greedy algorithm to come up with an effective homework schedule. The Greedy Tester also has a sample problem which is solved by our Homework Scheduler (i.e. HW_Sched.java).



 IMPLEMENTATION

 As it can be seen in the sample problem in "GreedyTester.java", we have created two arrays of the same size; one of weight and one of deadlines for the homework. Each index represents a single homework. For instance "weights[2]" and "deadlines[2]" would represent the weight and deadline of the third homework.

 The arrays will contain integers between 1 and 100 and each HW takes one hour to complete.

 The variable "m" hold the value for the total number of homeworks present.

 In our tester, an instance of "HW_Sched" is created with the weights, deadlines, and number of HW items (m). We can then call the method "SelectAssignments" to output an array of length equal to the last deadline. Each entry in the array represents a one-hour timeslot, starting at 0 and ending at 'last deadline - 1'. For each time slot, homeworkPlan indicates the homework which you plan to do during that slot. All homeworks are due at the beginnning of a timeslot (i.e. if deadline is 'x', then it can be completed on any slot including 0 to 'x-1' but not 'x').

 This greedy algorithm uses the sum of weights of completed assignments to come up with a greedy solution. So this solution should be used if weights are a priority.
