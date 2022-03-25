package com.sujata.demo;

public class Eggs {
	private int totalNoOfEggs;
	private EggUnit convertedEggs;
	
	public void setTotalNoOfEggs(int totalNoOfEggs) {
		this.totalNoOfEggs = totalNoOfEggs;
	}
	public EggUnit getConvertedEggs() {
		convertedEggs=new EggUnit();
		convertedEggs.setGross(totalNoOfEggs/144);
		convertedEggs.setDozen((totalNoOfEggs%144)/12);
		convertedEggs.setRemaining((totalNoOfEggs%144)%12);
		return convertedEggs;
	}
	
	

}
