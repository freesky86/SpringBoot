package com.freesky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freesky.bean.Country;
import com.freesky.service.CountryService;

@RestController
@RequestMapping("country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    /**
     * http://localhost:8080/country/query?code=AGO
     * 
     * @param code the key of Country table
     * @return
     */
    @RequestMapping("query")
    public Country getCountryByCode(String code) {
        Country country = countryService.queryCountryByCode(code);
        return country;
    }
}
