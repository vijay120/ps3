/* For CS 133 students:
 *
 * This and associated files make up one of the programming assignments that
 * my CS 51 (Intro to CS) students worked on.  I am making the files available
 * without any modification.  Feel free to extract any parts of the Java files
 * and use them if you want.
 */

import java.util.*;
import java.io.*;

public class UseStudents {

    public static void main(String[] args) throws IOException {

	String inputFileName = ".//s0.txt";
	//String inputFileName = ".\\s0.txt"; // Try this if the other
	                                      // doesn't work on your machine.

	// Establish a input stream so that we can read the file
	StudentReader sreader = new StudentReader(inputFileName);

	// Read the number of entries first
	int numStudents = 0;
	if (sreader.hasNext()) {
	    numStudents = sreader.getSize();
	}

	// Now that we know the size, we can create an array with that size
	Student[] students = new Student[numStudents];

	// Read the rest of the input file
	int i = 0;
	while (sreader.hasNext()) {
	    Student s = sreader.readStudent();
	    students[i] = s;
	    i = i + 1;
	}

	// Now that we have all the student objects in an array, we can
	// use those objects to do whatever we want to do.

	// Compute the average GPA
	int sum = 0;
	for (i = 0; i < students.length; i++) {
	    sum = sum + students[i].getGPA();
	}

	// Output the computed results to the console
	System.out.println("\nNumber of students: " + numStudents);
	System.out.println("\nAverage GPA: " + sum/numStudents);

        // Find the student with the highest GPA who lives in California
        // and print the name and the GPA of that student.
        Student highestGPA = null;
        for (i = 0; i < students.length; i++) {
            if ("California".equals(students[i].getState())) {
                if (highestGPA == null) {
                    highestGPA = students[i];
                }
                else {
                    if (students[i].getGPA() > highestGPA.getGPA()) {
                        highestGPA = students[i];
                    }
                }
            }
        }
        if (highestGPA == null) {
            System.out.println("\nThere is no student from California");
        }
        else {
            System.out.println("\nHighest GPA from California: " +
                               highestGPA.getName() + 
                               "'s GPA: " + highestGPA.getGPA());
        }

        // Find and print the number of students from each state
        // in this format:
        //
        //   State, No of Students
        //   Arizona, 5
        //   California, 20
        //   Oregon, 6
        //   Washington, 7
        //
        // You may assume that the only valid state names are the 50
        // states in the USA.  That is, you will only see at most
        // those names in your input file.  In your output, do NOT
        // include the state names from which there is no student.

        // Let's create an array of state names so that I can intialize
        // the states array easier later.
        String[] stateNames = {
           "Alabama", "Alaska", "Arizona", "Arkansas", "California",
	   "Colorado", "Connecticut", "Delaware", "Florida", "Georgia",
           "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas",
           "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts",
           "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana",
           "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico",
           "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma",
	   "Oregon", "Pennsylvania", "Rhode Island", "South Carolina",
	   "South Dakota", "Tennessee", "Texas", "Utah", "Vermont",
           "Virginia", "Washington", "West Virginia", "Wisconsin",
           "Wyoming"};

        // Initialize the states array with State objects
        State[] states = new State[stateNames.length];
        for (int j = 0; j < states.length; j++) {
            states[j] = new State(stateNames[j], 0);
        }

        // Go through the student objects and update the number of students
        // from each state objects.
        for (int j = 0; j < students.length; j++) {
            String stateName = students[j].getState();
            for (int k = 0; k < states.length; k++) {
                // System.out.println(stateName + " " + states[k].getName());
                if (stateName.equals(states[k].getName())) {
                    states[k].setCount(states[k].getCount() + 1);
                    break;
                }
            }
        }

        // Print the table now.
        System.out.println("\n\n" + padString("State", 20) + "No of Students");
        System.out.println(padString("-----", 20) + "--------------");
        for (int k = 0; k < states.length; k++) {
            if (states[k].getCount() > 0) {
                System.out.println(padString(states[k].getName(), 20) +
                                   states[k].getCount());
            }
        }
    }


    /*
     * These functions are used to make the output prettier
     */

    // Makes a string of length n with blank spaces.
    private static String makeBlankString (int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + " ";
        }
        return s;
    }

    // It adds blank spaces at the end of the string so that the
    // length of the string will be n characters long.
    private static String padString (String s, int n) {
        if (s.length() >= n) {
            return s;
        }
        else {
            return s + makeBlankString(n - s.length());
        }
    }

}