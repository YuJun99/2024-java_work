package test.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Quiz {
	public static void main(String[] args) throws IOException {
		var br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = new FileWriter("C:\\Users\\user\\Desktop\\test.txt");
		
		String s = br.readLine();
		
		var bw = new BufferedWriter(fw);
		bw.write(s);
		bw.close();
	}
}
