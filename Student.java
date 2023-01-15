package linkedlistproject;

import java.util.Objects;


class Student { 
	private String name;
	private String roll;
	private double pct;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public double getPct() {
		return pct;
	}
	public void setPct(double pct) {
		this.pct = pct;
	}
	public Student(String name,String roll,double pct) {
		this.name=name;
		this.roll=roll;
		this.pct=pct;
	}
	
}
