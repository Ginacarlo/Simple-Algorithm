package Pkg017_Distributore;

public class Vending_Machine {

	Display display;
	SafeBox safebox;
	private int choise;
	private double amount;
	private double change;

	// Machine Constructor

	public Vending_Machine() {

		display = new Display();
		safebox = new SafeBox();
	}

	// Machine Attribute

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getChange() {
		return change;
	}

	public void setChange(double change) {
		this.change = change;
	}

	public int getChoise() {
		return choise;
	}

	public void setChoise(int choise) {
		this.choise = choise;
	}

	// Machine Methods

	public void Menu() {

		display.MenuDisplay();

	}

	public void ChoiseProduct() {

		choise = getChoise();

		if (choise == 1) {

			display.Choise(choise);

		} else if (choise == 2) {

			display.Choise(choise);

		} else if (choise == 3) {

			display.Choise(choise);

		} else if (choise == 4) {

			display.Choise(choise);

		} else if (choise == 5) {

			display.Choise(choise);

		} else if (choise == 6) {

			display.Choise(choise);

		} else if (choise == 7) {

			display.Choise(choise);

		} else if (choise == 8) {

			display.Choise(choise);

		} else if (choise == 9) {

			display.Choise(choise);

		} else if (choise == 10) {

			display.Choise(choise);

		} else {

			display.Choise(choise);
		}

	}

	public void price() {

		choise = getChoise();

		if (choise == 1 || choise == 2 || choise == 3 || choise == 4) {

			display.Price(1);

		} else if (choise == 5) {

			display.Price(0);

		} else if (choise == 6 || choise == 8 || choise == 9 || choise == 10) {

			display.Price(3);

		} else if (choise == 7) {

			display.Price(2);
		}

	}

	public void Money() {

		choise = getChoise();
		amount = getAmount();
		safebox.setChange(amount);

		if (choise == 1 || choise == 2 || choise == 3 || choise == 4) {

			change = safebox.GiveCash(2.0);
			display.Message("\t--------> Take your Product and Take your Change " + change + " $");
			System.out.println();
			display.Message("\t<------<|| Thanks and Goodbye!! ||>------>");

		} else if (choise == 5) {

			change = safebox.GiveCash(1.0);
			display.Message("\t--------> Take your Product and Take your Change " + change + " $");
			System.out.println();
			display.Message("\t<------<|| Thanks and Goodbye!! ||>------>");

		} else if (choise == 6 || choise == 8 || choise == 9 || choise == 10) {

			change = safebox.GiveCash(3.0);
			display.Message("\t--------> Take your Product and Take your Change " + change + " $");
			System.out.println();
			display.Message("\t<------<|| Thanks and Goodbye!! ||>------>");

		} else if (choise == 7) {

			change = safebox.GiveCash(2.50);
			display.Message("\t--------> Take your Product and Take your Change " + change + " $");
			System.out.println();
			display.Message("\t<------<|| Thanks and Goodbye!! ||>------>");
		}

	}

}


/************************************************************
* (C) Copyright 2021 by GinaCarlo, and All Rights Reserved. *
* Java development code with basic simple algorithms.       *
* There is no guarantee regarding the use of these codes,   *
* the author will not be responsible for any damage.        *
* Java Study Course 2021 (C) (R)                            *
************************************************************/
