package com.freesky.service;

import java.util.List;

import com.freesky.bean.Country;

public interface CountryService {

    public List<Country> findCountryList();

    public Country queryCountryByCode(String code);

    public void saveCountry(Country country) throws Exception;

}
