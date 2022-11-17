package trainee.chainsys.java;

import com.chainsys.day2.HospitalDetails;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  HospitalDetails hospital = new  HospitalDetails();
			hospital.noofAmbulance = 30;
			hospital.noofBeds = 70;
			hospital.noofDoctors = 100;
			hospital.chargePerDay = 330;
			hospital.address = "Hospital,No.4,west street,porur,chennai";
			hospital.aggregatedbyWho = 'Y';
			
			System.out.println(hospital.hospitalName);
			System.out.println(hospital.noofAmbulance);
			System.out.println(hospital.noofDoctors);
			System.out.println(hospital.noofBeds);
			System.out.println(hospital.chargePerDay);
			System.out.println(hospital.address);
			System.out.println(hospital.aggregatedbyWho);
			
			
	}

}
