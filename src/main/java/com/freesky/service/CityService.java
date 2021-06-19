package com.freesky.service;

import java.util.List;

import com.freesky.bean.City;

public interface CityService {

    public void deleteCity(String cityId);

    public City queryCityById(String cityId);

    public City queryCityByIdCustom(Integer id);

    public List<City> queryCityByLanguageCustom(String language);

    public List<City> queryCityList(City city);

    public List<City> queryCityListPaged(City city, Integer page, Integer pageSize);

    public void saveCity(City city) throws Exception;

    public void saveCityTransactional(City city);

    public void updateCity(City city);
}
