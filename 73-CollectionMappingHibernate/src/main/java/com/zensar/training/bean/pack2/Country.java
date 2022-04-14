package com.zensar.training.bean.pack2;

import java.util.HashSet;
import java.util.Set;

public class Country {
	int countryId;
	String countryName;
	Set<String> cityNames;

	private void init() {
		if(this.cityNames==null)
		this.cityNames = new HashSet<String>();
	}

	public Country() {
		super();
		init();
	}

	public Country(int countryId) {
		super();
		this.countryId = countryId;
		init();
	}

	public Country(String countryName) {
		super();

		this.countryName = countryName;
		init();
	}

	public Country(int countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		init();
	}

	public Country(int countryId, String countryName, Set<String> cityNames) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.cityNames = cityNames;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Set<String> getCityNames() {
		return cityNames;
	}

	public void setCityNames(Set<String> cityNames) {
		this.cityNames = cityNames;
	}

	public boolean addCityName(String cityName) {
		return this.cityNames.add(cityName);
	}

	public boolean removeCityName(String cityName) {
		return this.cityNames.add(cityName);
	}

	public void clearAllCities() {
		this.cityNames.clear();
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + ", cityNames=" + cityNames + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + countryId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (countryId != other.countryId)
			return false;
		return true;
	}

}
