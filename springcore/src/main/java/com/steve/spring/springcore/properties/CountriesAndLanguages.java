package com.steve.spring.springcore.properties;

import java.util.Properties;

public class CountriesAndLanguages {

	private Properties countryAndLang;

	public Properties getCountryAndLang() {
		return countryAndLang;
	}

	public void setCountryAndLang(Properties countryAndLang) {
		this.countryAndLang = countryAndLang;
	}

	@Override
	public String toString() {
		return "CountriesAndLanguages [countryAndLang=" + countryAndLang + "]";
	}
}
