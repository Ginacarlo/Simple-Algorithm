package Pkg017_Distributore;

import java.util.ArrayList;

public class SafeBox {

	Display display;

	private ArrayList<Double> money = new ArrayList<Double>();
	private Double change;

	// SafeBox Constructor

	public SafeBox() {

		display = new Display();

	}

	// SafeBox Attribute

	public double getChange() {
		return change;
	}

	public void setChange(Double change) {
		this.change = change;
	}

	// SafeBox Methods

	public void Cashinto(Double cash) {

		money.add(getChange());

	}

	public Double GiveCash(Double amount) {

		Double rest;

		change = getChange();

		rest = change - amount;

		return rest;
	}
}

/************************************************************
 * (C) Copyright 2021 by GinaCarlo, and All Rights Reserved. * Java development
 * code with basic simple algorithms. * There is no guarantee regarding the use
 * of these codes, * the author will not be responsible for any damage. * Java
 * Study Course 2021 (C) (R) *
 ************************************************************/