/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tspnn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author rfoote
 */
public class ReadFile {
    private String path;
    
    public ReadFile(String filePath) {
	path = filePath;
    }
    
    public String OpenFile() throws IOException {
	StringBuilder sb = new StringBuilder();
	FileReader fr = new FileReader(path);
	BufferedReader br = new BufferedReader(fr);
	String lineIn = br.readLine();
	
	while (lineIn != null) {
	    sb.append(lineIn);
	    sb.append('\n');
	    lineIn = br.readLine();
	}
	return sb.toString();
    }
}
