package me.cs102;

public class CloneCallingClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		NYUStudent s1 = new NYUStudent("Able","123");
		NYUFaculty f1 = new NYUFaculty ("Baker","456");
		NYUPlan p1 = new NYUPlan(); p1.major = "comp sci";
		s1.Advisor=f1;
		s1.Program = p1;
		NYUStudent s2;
		s2 = s1.clone();
		s2.SID = "456";
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		

	}

}
