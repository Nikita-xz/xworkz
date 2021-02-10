package com.xworkz.weapon.brahmos;

public class MissleBrahmosWeapon implements BrahmosWeapons
,Cloneable{
	private int range;

	@Override
	public void damage() {
		System.out.println("Invoked damage");
	}

	@Override
	public void abort() {
		System.out.println("Invoked abort");
	}

	@Override
	public void dontknow() {
		System.out.println("invoked dontknow");
	}
	
	@Override
	public MissleBrahmosWeapon clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (MissleBrahmosWeapon)super.clone();
	}

}
