package me.cs102;

public class DyanmicBinding_NYUClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      NYUPerson p;
      p = new NYUFaculty("Fac Name","123");
      p.sendemail("Hello1");
      p = new NYUStudent("Student Name","456");
      p.sendemail("Hello2");
      p = new NYUTransfer("Student Name","789");
      p.sendemail("Hello3");
	}

}
