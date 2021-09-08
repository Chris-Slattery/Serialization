/**
 * @(#)PersistExample.java
 *
 *
 * @author
 * @version 1.00 2021/5/25
 */
//This class serializes an object and outputs it to a file.

import java.io.*;
public class PersistExample {

    public static void main(String args[]) throws Exception {
    	Student s1 = new Student(4, "Chris", 31);    //Create object

    	//Write object into file
    	FileOutputStream f = new FileOutputStream("StudentDetails.txt");
    	ObjectOutputStream out = new ObjectOutputStream(f);
    	out.writeObject(s1);
    	out.flush();

    	//Close streams to prevent memory leaks
    	out.close();
    	f.close();
    	System.out.println("Success");

    }//end main


}//end class