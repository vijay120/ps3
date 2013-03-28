import java.io.*;
import java.util.*;

public class CourseReader {

    private BufferedReader input;
    private String line;
    
    public CourseReader(String fileName) throws IOException {
        input = new BufferedReader(new FileReader(fileName));
	line = readALine();
    }
    
    public String readALine () {
	String ln = "";
	try {
            ln = input.readLine();
        }
	catch (IOException e) {
	    ;
        }
	return ln;
    }

    public int getSize() {
	String tempLine = line;
	if (line != null) {
	    line = readALine(); // name of next student if exists
	}
	return Integer.parseInt(tempLine);
    }

    public boolean hasNext() {
        return line != null;
    }

    public Course readCourse() {
	Course s = new Course();
	s.setName(line.substring(6)); // line was read in in the constructor
                                      // in the previous call.

        line = readALine();
        s.setSemester(line.substring(10));


        line = readALine();                       // Id
        s.setID(Integer.parseInt(line.substring(4)));  // skip "Id: "

        line = readALine(); // blank line

        // Read the name of next student if exists in the input file
        if (line != null) {
            line = readALine();
        }
	return s;
    }

}