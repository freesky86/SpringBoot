package com.freesky.service;

import com.freesky.bean.Country;

public interface CountryService {

    public Country queryCountryByCode(String code);

    public void saveCountry(Country country) throws Exception;

}
