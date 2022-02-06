package com.freesky.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freesky.bean.Country;
import com.freesky.mapper.CountryMapper;
import com.freesky.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryMapper countryMapper;

    @Override
    public Country queryCountryByCode(String code) {
        Country country = countryMapper.selectByPrimaryKey(code);
        return country;
    }

    @Override
    public void saveCountry(Country country) throws Exception {
        countryMapper.insert(country);
    }

    /**
     * @param countryMapper the countryMapper to set
     */
    protected void setCountryMapper(CountryMapper countryMapper) {
        this.countryMapper = countryMapper;
    }

}
