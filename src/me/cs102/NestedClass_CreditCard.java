package me.cs102;

public class NestedClass_CreditCard { 
   
    static int outer_x = 10;
      int outer_y = 20;
     
   
    private static int outer_private = 60;
   
   static  class   StaticNestedClass
    {
        void display()
        {
            // can access static member of outer class
            System.out.println("outer_x = " + outer_x);
             
            // can access display private static member of outer class
            System.out.println("outer_private = " + outer_private);
             
            // The following statement will give compilation error
            // as static nested class cannot directly access non-static membera
            // System.out.println("outer_y = " + outer_y);
         
        }
    }
}
 
class  StaticNestedClassDemo
{
    public static void main(String[] args)
    {
       //   accessing a static nested class
         NestedClass_CreditCard.StaticNestedClass nestedObject = new NestedClass_CreditCard.StaticNestedClass();
         
       nestedObject.display();
    	 
    }

}
