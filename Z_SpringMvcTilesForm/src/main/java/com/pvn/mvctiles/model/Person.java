package com.pvn.mvctiles.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person
{

	private String			gender;
	private String			age;
	private List<String>	ageList;

	private List<String>	countryList;
	private List<String>	selectedCountryList;
	private String			homeCountry;
	private String			neighbourCountry;
	private List<Country>   countryEntityList = new ArrayList<>();
	

	public Person()
	{
		this.ageList = new ArrayList<String>();
		this.ageList.add("Above 10");
		this.ageList.add("Above 20");
		this.ageList.add("Above 30");
		this.ageList.add("Above 40");
		this.ageList.add("Above 50");
		this.ageList.add("Above 60");

		this.countryList = Arrays.asList("Bhutan", "Nepal", "Srilanka", "Bangladesh", "Pakistan", "China", "Barma", "Kenya");
		this.homeCountry = "CHINA";
		
		this.countryEntityList.add(new Country("South Africa", "SA"));
		this.countryEntityList.add(new Country("New Zealand", "NZ"));
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public String getAge()
	{
		return age;
	}

	public void setAge(String age)
	{
		this.age = age;
	}

	public List<String> getAgeList()
	{
		return ageList;
	}

	public void setAgeList(List<String> ageList)
	{
		this.ageList = ageList;
	}

	public List<String> getCountryList()
	{
		return countryList;
	}

	public void setCountryList(List<String> countryList)
	{
		this.countryList = countryList;
	}

	public List<String> getSelectedCountryList()
	{
		return selectedCountryList;
	}

	public void setSelectedCountryList(List<String> selectedCountryList)
	{
		this.selectedCountryList = selectedCountryList;
	}

	public String getHomeCountry()
	{
		return homeCountry;
	}

	public void setHomeCountry(String homeCountry)
	{
		this.homeCountry = homeCountry;
	}

	public String getNeighbourCountry()
	{
		return neighbourCountry;
	}

	public void setNeighbourCountry(String neighbourCountry)
	{
		this.neighbourCountry = neighbourCountry;
	}

	public List<Country> getCountryEntityList()
	{
		return countryEntityList;
	}

	public void setCountryEntityList(List<Country> countryEntityList)
	{
		this.countryEntityList = countryEntityList;
	}

}
