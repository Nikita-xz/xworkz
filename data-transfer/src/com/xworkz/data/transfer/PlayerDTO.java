package com.xworkz.data.transfer;

public class PlayerDTO {
	private String name;
	private String country;
	private String[] sports;
	private String[] awards;
	
	public PlayerDTO() {
	    	System.out.println("invoked PlayerDTO");  
	      }
	    public String getName() {
			return name;
		}
	    public String getCountry() {
			return country;
		}
	    public String[] getSports() {
			return sports;
		}
	    public String[] getAwards() {
			return awards;
	    }
		
	    public void setName(String name) {
			this.name = name;
	    }
	    public void setCountry(String country) {
			this.country = country;
	    }
	    public void setSports(String[] sports) {
			this.sports = sports;
	    }
	    public void setAwards(String[] awards) {
			this.awards = awards;
		}
}
