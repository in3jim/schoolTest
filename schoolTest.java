import java.util.*;

public class school {
	public static void main(String[] args){
		String[] name = {"jessica","alan"};
		double[] height = {154, 180};
		double[] weight = {50, 70};
		String[] det = {"IT","TI"};
		double[] score = {80,90};
		
		//學生
		Student x = new Student(name[0],height[0],weight[0],det[0],score[0]);
		Student y = new Student(name[1],height[1],weight[1],det[1],score[1]);
		
		System.out.println("你好");
	}
}
	
class Human {
     private String name;
     private double height;
     private double weight;
     private double bmi;
     
     public String getName() {  
    	return this.name;
    }
	
    public double getBMI() {
    	return this.bmi;
    }
    
    public void setHeightWeight() {
		this.bmi = this.weight / (this.height * this.height);
    }
}
    
class Student extends Human{
	public String name;
	public double height;
	public double weight;
	public String department;
	public double score;
	
	public Student(String name, double height, double weight, String department, double score){
	    this.name = name;
	    this.height = height;
	    this.weight = weight;
	    this.department = department;
	    this.score = score;
	}
    	
	public void output() {
		System.out.println("Name:"+name);
		System.out.println("Height:"+height);
		System.out.println("Weight:"+weight);
		System.out.println("department:"+department);
		System.out.println("Score:"+score);
	}
}
