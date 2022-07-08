package com.bridgelab.lambdaexpression;

import java.util.Scanner;

public class UserRegisteration {

	public static void main(String[] args) {
		boolean validOutput = false;
		Scanner sc = new Scanner(System.in);
		UserRegImplemtation reg = new UserRegImplemtation();
		reg.clearAllSampleEmail();
		System.out.println(" User Registeration using Regex...!!");
		System.out.println();
		while (validOutput == false) {
			System.out.println("Please Enter Your first name..!!");
			String fName = sc.nextLine();
			validOutput = reg.validateFName(fName);
			System.out.println();
		}
		validOutput = false;
		while (validOutput == false) {
			System.out.println("Please Enter the Last Name..!!");
			String lName = sc.nextLine();
			validOutput = reg.validateLname(lName);
			System.out.println();
		}
		validOutput = false;
		while (validOutput == false) {
			System.out.println("Please Enter the E-mail Address..!!!");
			String email = sc.nextLine();
			validOutput = reg.valdateEmail(email);
			System.out.println();
		}
		validOutput = false;
		while (validOutput == false) {
			System.out.println("Please Enter the phone number with country code..!!");
			String phone = sc.nextLine();
			validOutput = reg.validatephoneNumber(phone);
			System.out.println();
		}
		validOutput = false;
		while (validOutput == false) {
			System.out.println("Please Enter password of 8 characters...!!!");
			String pwd = sc.nextLine();
			validOutput = reg.validatePwd(pwd);
			System.out.println();
		}
		sc.close();

	}

}
