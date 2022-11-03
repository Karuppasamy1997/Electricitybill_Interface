package org.electricalbillabstrac;

import java.util.Scanner;

abstract class  Electricabillsystem implements Commercial,Domestic  {
	public static void main(String[] args) {
       
		Scanner s = new Scanner(System.in);

		System.out.println("commercial:\nDemostic:2");
		int d = s.nextInt();
		System.out.println("enter rural:1\npanchayat:2\nurban:3\nmetropolitan:4");
		int a = s.nextInt();

		if (d == 1) {

			switch (a) {
			case 1: {
				Commercial.rural();
				break;

			}
			case 2: {
				Commercial.panchayat();
				break;
			}
			case 3: {
				Commercial.urban();
				break;
			}
			case 4: {
				Commercial.metropolitan();
				break;
			}
			}

		} else if (d == 2) {

			switch (a) {

			case 5: {
				Domestic.rural();
				break;
			}
			case 6: {
				Domestic.panchayat();
				break;
			}
			case 7: {
				Domestic.urban();
				break;
			}
			case 8: {
				Domestic.metropolitan();
				break;
			}

			}

		}

	}
}
