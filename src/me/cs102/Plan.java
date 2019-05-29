package me.cs102;

public class Plan implements Cloneable{
int years=4;
String major = "CompSci";
 public Plan clone() throws CloneNotSupportedException {
	 return (Plan) super.clone();
 }
}
