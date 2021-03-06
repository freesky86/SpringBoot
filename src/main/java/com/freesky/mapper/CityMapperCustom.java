package com.freesky.mapper;

import java.util.List;

import com.freesky.bean.City;

public interface CityMapperCustom {

    List<City> queryCityInfoByLanguage(String language);

    List<City> queryCitySimplyInfoById(Integer id);
}