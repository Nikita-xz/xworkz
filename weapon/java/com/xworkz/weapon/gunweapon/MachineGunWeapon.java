package com.xworkz.weapon.gunweapon;

public class MachineGunWeapon implements GunWeapon {
	private int noOfBullets;

	@Override
	public void damage() {
		System.out.println("Invoked damage");

	}

	@Override
	public void abort() {
		System.out.println("Invoked abort");

	}

	@Override
	public void trigger() {
		System.out.println("Invoked trigger");

	}

	@Override
	public String toString() {
		return "MachineGunWeapon [noOfBullets=" + noOfBullets + "]";
	}
	
	@Override
	public int hashCode() {
		return 20;
	}
	
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(this==obj) {
				return true;
			}else {
				if(obj instanceof MachineGunWeapon) {
					return true;
				}
			}
			return true;
		}
		return false;
		
	}


}
