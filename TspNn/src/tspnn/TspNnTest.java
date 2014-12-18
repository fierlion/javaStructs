
package tspnn;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author rfoote
 */
public class TspNnTest {
    public static void main(String [] args) throws FileNotFoundException, IOException {
	
	String fileName = "/home/rfoote/Desktop/test-input-3.txt";
	//read fileName into inputString
	String inputString = "";
	try {
	    ReadFile file = new ReadFile(fileName);
	    inputString = file.OpenFile();
	}
	catch (IOException e) {
	    System.out.println( e.getMessage());
	}
	//create set of points
	InputToArray setOut = new InputToArray(inputString);
	ArrayList<Point> setV = setOut.makeArray();
	
    }   
}
