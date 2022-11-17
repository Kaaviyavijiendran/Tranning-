package trainee.chainsys.java;

import com.chainsys.day2.Hotel;

public class TestHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel food = new Hotel();
		food.hotelName = "Boss Briyani";
		food.hotelAddress = "No.54,east street,thambaram,chennai";
		food.noofSeat = 150;
		food.ac = true;
		food.nonveg = true;
		food.menu = "Chicken Briyani";
		food.menu = "Mutton Briyani";
		food.chickenBriyaniPrice = 150;
		food.muttonBriyaniPrice = 250;
		
		System.out.println(food.hotelName);
		System.out.println(food.hotelAddress);
		System.out.println(food.noofSeat);
		System.out.println(food.ac);
	    System.out.println(food.nonveg);
	    System.out.println(food.menu);
	    System.out.println(food.chickenBriyaniPrice);
		
	}

}
