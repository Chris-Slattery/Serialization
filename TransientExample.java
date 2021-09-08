/**
 * @(#)TransientExample.java
 *
 *
 * @author
 * @version 1.00 2021/5/25
 */
//Program illustrating how the transient keyword works.
//Transient keyword is used during serialization. Fields that are transient cannot be serialized or deserialized.
//Cannot be used with fnal or static keywords.


class TransientExample implements Serializable {
	transient int age;

	//Serialize other fields
	private String name;
	private String address;


}//end class