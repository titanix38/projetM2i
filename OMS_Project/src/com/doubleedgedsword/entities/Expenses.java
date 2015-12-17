package com.doubleedgedsword.entities;

public class Expenses implements IEntitiy
{

	private int id;
	private String description;
	private double cost;
	
	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public double getCost()
	{
		return cost;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}
	
	public int getId()
	{
		// TODO Auto-generated method stub
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
		// TODO Auto-generated method stub		
	}
	
	
}
