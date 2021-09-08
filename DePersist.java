/**
 * @(#)DePersist.java
 *
 *
 * @author
 * @version 1.00 2021/5/25
 */

 //This class deserializes the object in the file and prints its contents.
 //Age prints out as 0 as it is transient and cannot be deserialized. This is the default value.

import java.io.*;

public class DePersist {


    public static void main(String args[]) throws Exception {
    	ObjectInputStream in = new ObjectInputStream(new FileInputStream("StudentDetails.txt"));
    	Student s = (Student)in.readObject();
    	System.out.println(s.id + " " + s.name + " " + s.age);
    	in.close();

    }//end main


}//end class