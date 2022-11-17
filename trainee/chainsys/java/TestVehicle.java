package trainee.chainsys.java;

import com.chainsys.day2.NewVehicle;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 NewVehicle vehicle = new NewVehicle();
			vehicle.bikeNo = 1708;
			vehicle.bikePrice = 175000f;
			vehicle.ownerName = "Tamil";
			vehicle.insurance = "Applied";
			vehicle.typeofVehicle = "Twowheeler";
			vehicle.licence = true;
			
			
			System.out.println(vehicle.bikeNo);
			System.out.println(vehicle.bikePrice);
			System.out.println(vehicle.ownerName);
			System.out.println(vehicle.insurance);
			System.out.println(vehicle.typeofVehicle);
			System.out.println(vehicle.licence);
	}

}
