package me.cs102;
import java.util.Random;


public class NestedClass_CreditCard2 { 
   
    static int accountnumber;
    int creditlimit = 20;
    static CardInfo thiscard;
    
    public NestedClass_CreditCard2(int acct) {
    	accountnumber = acct;
    	Random r =new Random();
    	 thiscard = new CardInfo(r.nextInt(100));
    	
    }
    
    public static void displayInfo() {
    	System.out.println(accountnumber);
    	System.out.println(thiscard.ccode);
    }
   
   static  class   CardInfo
    {
	   private String materialtype="TypeA";
	   private static int ccode;
	    CardInfo(int incode) {
	    	ccode= incode;
	    }
        void display() {
        	System.out.println(materialtype + " - " + ccode);
        }
    }
}
 

