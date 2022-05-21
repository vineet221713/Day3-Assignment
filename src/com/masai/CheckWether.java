package com.masai;

    public class CheckWether {
	boolean isSnowing = false;
	boolean isRaining = true;
	double temperature = 60.0;
	
	public static void main(String[] args) {
		CheckWether d1 = new CheckWether();
		if(d1.isSnowing||d1.isRaining==true) {
			System.out.println("Let’s stay home");
		}
		else if (d1.temperature<=50) {
			System.out.println("Let’s go out!");
		}
		
	}
	

}
