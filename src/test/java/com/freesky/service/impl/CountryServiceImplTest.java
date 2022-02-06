package com.freesky.service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.freesky.bean.Country;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class CountryServiceImplTest {

    // @MockBean
    // private CountryMapper countryMapper;

    @Autowired
    private CountryServiceImpl service;

    @Test
    public void queryCountryByCode() {

        Country result = service.queryCountryByCode("AIA");

        assertEquals("Anguilla", result.getName());
    }

    @Test
    @Rollback
    public void saveCountry() throws Exception {
        Country country = new Country();
        country.setCode("ABC");
        country.setName("Test Country");
        country.setContinent("Africa");
        country.setRegion("Caribbean");
        service.saveCountry(country);

        Country result = service.queryCountryByCode("ABC");
        assertEquals(country.getName(), result.getName());
    }

}
