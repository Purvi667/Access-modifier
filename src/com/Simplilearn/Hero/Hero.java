package com.Simplilearn.Hero;

public class Hero {
	public String  Name;
	public double assets;
	protected String items;
	
	Hero(String Name,double assets,String items){
		this.Name = Name;
		this.assets = assets;
		this.items= items;
	}

	public static void main(String[] args) {
		

	}
	public String getName() {
		return this.Name;
	}
	private double getAssets() {
		return this.assets;
	}
	protected String getItems() {
		return this.items;
	}

}
