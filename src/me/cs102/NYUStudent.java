package me.cs102;

public class NYUStudent extends NYUPerson{
	
	public String SID;
	public NYUStudent(String inname  , String inid   ) {
		name = inname;
		SID=inid;
	}
	 public String toString() {
		 return " Student Name: " + name + " ID: " + SID;
	 }
	public void sendemail(String message, int priority) {
		// send an email with above message with given priority
		System.out.println(priority+"dd");
		System.out.println("NYUStudent class " + message + " " + Integer.toString(priority) );
	}
}
