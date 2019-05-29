package me.cs102;

public class NYUFaculty extends NYUPerson {

public String ID;
public NYUFaculty(String inname  , String inid   )    {
	name = inname;
	ID=inid;
}
public String toString() {
	return " Faculty Name: " + name + " ID: " +  ID;
}
public void sendemail(String message) {
	// send an email with above message with priority normal
	System.out.println("NYUFaculty class " + message);
}
public void sendemail(String message, int priority) {
	// send an email with above message with given priority
	System.out.println("NYUFaculty class " + message + " " + Integer.toString(priority) );
}
}
