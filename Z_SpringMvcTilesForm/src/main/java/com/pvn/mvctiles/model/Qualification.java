package com.pvn.mvctiles.model;

import java.util.List;

public class Qualification
{
	private boolean completed;
	private List<String> courses;
	private String result;
	
	public boolean isCompleted()
	{
		return completed;
	}

	
	public void setCompleted(boolean completed)
	{
		this.completed = completed;
	}

	public List<String> getCourses()
	{
		return courses;
	}
	
	public void setCourses(List<String> courses)
	{
		this.courses = courses;
	}
	
	public String getResult()
	{
		return result;
	}
	
	public void setResult(String result)
	{
		this.result = result;
	}
}
