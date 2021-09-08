/**
 * @(#)Student.java
 *
 *
 * @author
 * @version 1.00 2021/5/25
 */
//Program to illustrate how the transient keyword is used in serialization.
//If a data member is defined as being tansient, it will not be serialized.

import java.io.Serializable;

public class Student implements Serializable{

	int id;
	String name;
	transient int age;   //This variable will not be serialized as its transient.


    public Student(int id, String name, int age) {
    	this.id = id;
    	this.name = name;
    	this.age = age;

    }//end constructor


}//end class