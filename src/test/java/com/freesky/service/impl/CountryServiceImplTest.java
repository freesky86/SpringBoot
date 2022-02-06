package com.freesky.service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.freesky.bean.Country;
import com.freesky.mapper.CountryMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CountryServiceImplTest {

    @MockBean
    private CountryMapper countryMapper;

    @Autowired
    private CountryServiceImpl service;

    @Test
    public void queryCountryByCode() {

        Country result = service.queryCountryByCode("ABC");

        assertEquals("Test Country", result.getName());
    }

    @Before
    public void setup() {
        Country country = new Country();
        country.setCode("ABC");
        country.setName("Test Country");
        country.setContinent("Africa");
        country.setRegion("Caribbean");
        Mockito.when(countryMapper.selectByPrimaryKey("ABC")).thenReturn(country);
        service.setCountryMapper(countryMapper);
    }

}
