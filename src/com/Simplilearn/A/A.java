package com.Simplilearn.A;

public class A {
	
	//create private variable
	private String user;
	//create public variable
	public String bankName;
	//create protected variable
	protected String relation;
	//create default variable
	String address;
	

	//bank example
	public static void main(String[] args) {
		
	}
	public String getUser()
	{
		System.out.println("The private variable:"+ this.user);
		return this.user;
	}
	protected String getRelation()
	{
		System.out.println("The protected variable:"+ this.relation);
		return this.relation;
	}
}
