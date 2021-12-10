package Pkg017_Distributore;

public class Display {

	// Array Price
	private String pricelist[] = { "1.00", "2.00", "2.50", "3.00" };

	// Display Methods

	public void Message(String message) {

		System.out.println();
		System.out.print(message);
		System.out.print(" ");

	}

	public void MoneyMessage(Object object) {

		System.out.println();
		System.out.print(object);
		System.out.print(" ");

	}

	public void MenuDisplay() {

		System.out.println();
		System.out.println("<-----<|| VENDING MACHINE MENU ||>----->");
		System.out.println();
		System.out.println("\t[1] - COKE - $ 2.00");
		System.out.println("\t[2] - PEPSI - $ 2.00");
		System.out.println("\t[3] - FANTA - $ 2.00");
		System.out.println("\t[4] - SPRITE - $ 2.00");
		System.out.println("\t[5] - COFFE - $ 1.00");
		System.out.println("\t[6] - CHIPS - $ 3.00");
		System.out.println("\t[7] - M&Ms - $ 2.50");
		System.out.println("\t[8] - SNICKERS - $ 3.00");
		System.out.println("\t[9] - MARS - $ 3.00");
		System.out.println("\t[10] - TWIX - $ 3.00");

	}

	public void Choise(int choise) {

		final int COKE = 1;
		final int PEPSI = 2;
		final int FANTA = 3;
		final int SPRITE = 4;
		final int COFFE = 5;
		final int CHIPS = 6;
		final int MMS = 7;
		final int SNICKERS = 8;
		final int MARS = 9;
		final int TWIX = 10;

		switch (choise) {

		case COKE:
			System.out.println();
			System.out.println("\tYou have Chosen: ---> 'COKE' <---");
			break;

		case PEPSI:
			System.out.println();
			System.out.println("\tYou have Chosen: ---> 'PEPSI' <---");
			break;

		case FANTA:
			System.out.println();
			System.out.println("\tYou have Chosen: ---> 'FANTA' <---");
			break;

		case SPRITE:
			System.out.println();
			System.out.println("\tYou have Chosen: ---> 'SPRITE' <---");
			break;

		case COFFE:
			System.out.println();
			System.out.println("\tYou have Chosen: ---> 'COFFE' <---");
			break;

		case CHIPS:
			System.out.println();
			System.out.println("\tYou have Chosen: ---> 'CHIPS' <---");
			break;

		case MMS:
			System.out.println();
			System.out.println("\tYou have Chosen: ---> 'M&Ms' <---");
			break;

		case SNICKERS:
			System.out.println();
			System.out.println("\tYou have Chosen: ---> 'SNICKERS' <---");
			break;

		case MARS:
			System.out.println();
			System.out.println("\tYou have Chosen: ---> 'MARS' <---");
			break;

		case TWIX:
			System.out.println();
			System.out.println("\tYou have Chosen: ---> 'TWIX' <--- ");
			break;

		default:
			System.out.println();
			System.out.println("--> No Choice!!! <--");

		}
	}

	public void Price(int price) {

		System.out.println();
		System.out.println("\t---> The Price is: " + pricelist[price] + " $");

	}

}




/************************************************************
* (C) Copyright 2021 by GinaCarlo, and All Rights Reserved. *
* Java development code with basic simple algorithms.       *
* There is no guarantee regarding the use of these codes,   *
* the author will not be responsible for any damage.        *
* Java Study Course 2021 (C) (R)                            *
************************************************************/
