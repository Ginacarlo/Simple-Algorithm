package Pkg017_Distributore;

import java.util.Scanner;

public class User {

	Scanner input = new Scanner(System.in);

	Vending_Machine mach;
	private int choise;
	private int confirm;
	private double money;

	// User Constructor

	public User(Vending_Machine mach) {

		this.mach = mach;
	}

	// User Attribute

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	// User Methods

	public void Run() {

		// Enter the Menu

		while (true) {

			try {
				mach.display.Message("Press [1] to Access Menu:");
				choise = input.nextInt();

			} catch (Exception e) {

				mach.display.Message("Plase to Type only Numbers!!!");
				return;
			}

			if (choise == 1) {
				mach.Menu();
				Running();
				break;

			} else {
				mach.display.Message("[-- Wrong Button!!! --]");
				System.out.println();
				Run();
			}
			break;
		}
	}

	public void Running() {

		// Choise Product

		while (true) {

			try {
				mach.display.Message("\t---> Choice your Product: ");
				choise = input.nextInt();
				mach.setChoise(choise);

			} catch (Exception e) {

				mach.display.Message("Plase to Type only Numbers!!!");
				return;
			}

			if (choise == 1 || choise <= 10) {
				mach.ChoiseProduct();
				break;

			} else {
				mach.display.Message("[-- Wrong Button!!! --]");
				System.out.println();
				Running();
				break;
			}
		}

		// Confirm Choise Product

		while (true) {

			try {
				mach.display.Message("Press [1] to Confirm or [0] to Back Menu: ");
				confirm = input.nextInt();

			} catch (Exception e) {

				mach.display.Message("Plase to Type only Numbers!!!");
				return;
			}

			if (confirm == 1) {
				mach.price();
				Entrymoney();
				break;

			} else {
				mach.Menu();
				Running();
				break;
			}

		}
	}

	public void Entrymoney() {

		// Money Entry

		while (true) {

			try {
				mach.display.Message("\t-----> Insert Money Here $: ");
				money = input.nextDouble();
				mach.setAmount(money);

			} catch (Exception e) {

				mach.display.Message("Plase to Type only Numbers!!!");
				return;
			}

			choise = mach.getChoise();
			money = mach.getAmount();

			if (choise == 1 || choise == 2 || choise == 3 || choise == 4) {

				if (money < 2.0) {
					mach.display.Message("---> Please, Insert 2.00 $");
					mach.display.Message(" ");
					Entrymoney();

					break;

				} else if (money == 2.0) {

					mach.display.Message("--<<Take your Product>>--");
					mach.display.Message(" ");
					mach.display.Message("\t<------<|| Thanks and Goodbye!! ||>------>");
					Restart();
					break;

				} else {
					mach.Money();
					Restart();
					break;
				}

			} else if (choise == 5) {

				if (money < 1.0) {
					mach.display.Message("---> Please, Insert 1.00 $");
					mach.display.Message(" ");
					Entrymoney();
					break;

				} else if (money == 1.0) {

					mach.display.Message("--<<Take your Product>>--");
					mach.display.Message(" ");
					mach.display.Message("\t<------<|| Thanks and Goodbye!! ||>------>");
					Restart();
					break;

				} else {
					mach.Money();
					Restart();
					break;
				}

			} else if (choise == 6 || choise == 8 || choise == 9 || choise == 10) {

				if (money < 3.0) {
					mach.display.Message("---> Please, Insert 3.00 $");
					mach.display.Message(" ");
					Entrymoney();
					break;

				} else if (money == 3.0) {

					mach.display.Message("--<<Take your Product>>--");
					mach.display.Message(" ");
					mach.display.Message("\t<------<|| Thanks and Goodbye!! ||>------>");
					Restart();
					break;

				} else {
					mach.Money();
					Restart();
					break;
				}

			} else if (choise == 7) {

				if (money < 2.50) {
					mach.display.Message("---> Please, Insert 2.50 $");
					mach.display.Message(" ");
					Entrymoney();
					break;

				} else if (money == 2.50) {

					mach.display.Message("--<<Take your Product>>--");
					mach.display.Message(" ");
					mach.display.Message("\t<------<|| Thanks and Goodbye!! ||>------>");
					Restart();
					break;

				} else {
					mach.Money();
					Restart();
					break;
				}
			}
		}
	}

	public void Restart() {

		while (true) {

			try {
				mach.display.Message(" ");
				mach.display.Message("\t<-------------------------------------->");
				mach.display.Message(" ");
				mach.display.Message("\tFor Take Again Press [1] or [0] to exit: ");
				confirm = input.nextInt();

			} catch (Exception e) {

				mach.display.Message("Plase to Type only Numbers!!!");
				return;
			}

			if (confirm == 1) {
				mach.Menu();
				Running();
				break;

			} else {
				Run();
				break;
			}

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


