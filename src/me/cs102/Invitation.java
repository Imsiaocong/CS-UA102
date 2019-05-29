package me.cs102;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import sun.util.calendar.CalendarDate;

public   class Invitation <A> {
	  A Recipient;
	   int ticketnum;
	  public Invitation(A inrecipient, int innum) {                  // constructor
	   Recipient = inrecipient;
	   ticketnum = innum;
	  }
	  public A getRecipient() { return Recipient; }
	  public  int getTicketNumber() { return ticketnum;}
	  public String toString() {
		  if (Recipient instanceof NYUFaculty) {System.out.println("OK");}
	    return "[" + Recipient.toString() + ", Ticket#: " + Integer.toString(ticketnum) + "]";
	  }
}
