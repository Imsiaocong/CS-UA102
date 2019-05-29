package me.cs102;
import java.util.Date;
import java.util.GregorianCalendar;

import sun.util.calendar.CalendarDate;

public class GenericClass_Invitation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     NYUFaculty f = new NYUFaculty("Prof. Jones", "2l3");
     NYUStudent s = new NYUStudent("Mary Smith", "321");
     
     Invitation<NYUFaculty> inviteF = new Invitation<NYUFaculty>(f,232);
     System.out.println(inviteF.toString());
     
     Invitation<NYUStudent> inviteS = new Invitation<NYUStudent>(s,533);
     System.out.println(inviteS.toString());
	}

}
