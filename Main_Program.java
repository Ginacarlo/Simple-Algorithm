package Pkg017_Distributore;

public class Main_Program {

	public static void main(String[] args) {

		Vending_Machine mach;
		User user;
		mach = new Vending_Machine();
		user = new User(mach);
		user.Run();

	}

}

/************************************************************
* (C) Copyright 2021 by GinaCarlo, and All Rights Reserved. *
* Java development code with basic simple algorithms.       *
* There is no guarantee regarding the use of these codes,   *
* the author will not be responsible for any damage.        *
* Java Study Course 2021 (C) (R)                            *
************************************************************/
