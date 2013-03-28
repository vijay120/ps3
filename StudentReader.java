import java.io.*;
import java.util.*;

public class StudentReader {

    private BufferedReader input;
    private String line;
    
    public StudentReader(String fileName) throws IOException {
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

    public Student readStudent() {
	Student s = new Student();
	s.setName(line.substring(6)); // line was read in in the constructor
                                      // in the previous call.
        line = readALine();                       // Id
        s.setID(Integer.parseInt(line.substring(4)));  // skip "Id: "

        line = readALine();        // Major
        s.setMajor(line.substring(7));  // skip "Major: "

        line = readALine();                          // GPA
        s.setGPA(Integer.parseInt(line.substring(5)));  // skip "GPA: "

        line = readALine(); // blank line

        // Read the name of next student if exists in the input file
        if (line != null) {
            line = readALine();
        }
	return s;
    }

}