package org.electricalbillabstrac;

import java.util.Scanner;

public interface Commercial {

	static void rural() {
		Scanner x = new Scanner(System.in);
		System.out.println("enter units");
		int n = x.nextInt();
		int billpay;
		if (n < 100) {
			billpay = 0;
			System.out.println("no pay" + billpay);
		} else if (n > 100) {
			if (n <= 200) {
				billpay = (n - 100) * 1;
				System.out.println("Rs." + billpay);

			} else if (n <= 300) {
				billpay = 100 * 2 + (n - 200) * 3;
				System.out.println("Rs." + billpay);
			}
		}
	}

	static void panchayat() {
		Scanner x = new Scanner(System.in);
		System.out.println("enter units");
		int n = x.nextInt();
		int billpay;
		if (n < 100) {
			billpay = 100 * 0;
			System.out.println("no pay" + billpay);
		} else if (n > 100) {
			if (n <= 200) {
				billpay = (n - 100) * 2;
				System.out.println("Rs." + billpay);

			} else if (n <= 300) {
				billpay = 100 * 2 + (n - 200) * 3;
				System.out.println("Rs." + billpay);
			}
		}
	}

	static void urban() {
		Scanner x = new Scanner(System.in);
		System.out.println("enter units");
		int n = x.nextInt();
		int billpay;
		if (n < 100) {
			billpay = 0;
			System.out.println("no pay" + billpay);
		} else if (n > 100) {
			if (n <= 200) {
				billpay = (n - 100) * 3;
				System.out.println("Rs." + billpay);

			} else if (n <= 300) {
				billpay = 100 * 3 + (n - 200) * 4;
				System.out.println("Rs." + billpay);
			}
		}
	}

	static void metropolitan() {
		Scanner x = new Scanner(System.in);
		System.out.println("enter units");
		int n = x.nextInt();
		int billpay;
		if (n < 100) {
			billpay = 0;
			System.out.println("no pay" + billpay);
		} else if (n > 100) {
			if (n <= 200) {
				billpay = (n - 100) * 4;
				System.out.println("Rs." + billpay);

			} else if (n <= 300) {
				billpay = 100 * 4 + (n - 200) * 5;
				System.out.println("Rs." + billpay);
			}
		}
	}

}
