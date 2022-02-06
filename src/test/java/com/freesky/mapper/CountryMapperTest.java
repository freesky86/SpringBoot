package com.freesky.mapper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.freesky.bean.Country;

@SpringBootTest
@Transactional
public class CountryMapperTest {

    @Autowired
    private CountryMapper countryMapper;

    @Test
    @Rollback
    public void saveCountry() {
        Country country = new Country();
        country.setCode("ABC");
        country.setName("Test Country");
        countryMapper.insert(country);

        Country result = countryMapper.selectByPrimaryKey("ABC");
        assertEquals(country.getName(), result.getName());
    }

}
