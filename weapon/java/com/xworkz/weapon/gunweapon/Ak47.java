package com.xworkz.weapon.gunweapon;

public class Ak47 extends MachineGunWeapon {
	@Override
	public void trigger() {
		System.out.println("Overridded trigger");
		super.trigger();
	}


}
