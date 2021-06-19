package com.freesky.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.util.StringUtils;

import com.freesky.bean.City;
import com.freesky.mapper.CityMapper;
import com.freesky.mapper.CityMapperCustom;
import com.freesky.service.CityService;
import com.github.pagehelper.PageHelper;

import tk.mybatis.mapper.entity.Example;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    @Autowired
    private CityMapperCustom cityMapperCustom;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteCity(String cityId) {
        cityMapper.deleteByPrimaryKey(cityId);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public City queryCityById(String cityId) {

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return cityMapper.selectByPrimaryKey(cityId);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public City queryCityByIdCustom(Integer id) {

        List<City> cityList = cityMapperCustom.queryCitySimplyInfoById(id);

        if (cityList != null && !cityList.isEmpty()) {
            return cityList.get(0);
        }

        return null;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<City> queryCityList(City city) {

        try {
            Thread.sleep(11000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Example example = new Example(City.class);
        Example.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmptyOrWhitespace(city.getName())) {
            criteria.andLike("name", "%" + city.getName() + "%");
        }

        if (!StringUtils.isEmptyOrWhitespace(city.getCountrycode())) {
            criteria.andLike("countrycode", "%" + city.getCountrycode() + "%");
        }

        if (!StringUtils.isEmptyOrWhitespace(city.getDistrict())) {
            criteria.andLike("district", "%" + city.getDistrict() + "%");
        }

        List<City> cityList = cityMapper.selectByExample(example);

        return cityList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<City> queryCityListPaged(City city, Integer page, Integer pageSize) {
        // 开始分页
        PageHelper.startPage(page, pageSize);

        Example example = new Example(City.class);
        Example.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmptyOrWhitespace(city.getCountrycode())) {
            criteria.andLike("countrycode", "%" + city.getCountrycode() + "%");
        }
        if (!StringUtils.isEmptyOrWhitespace(city.getDistrict())) {
            criteria.andLike("district", "%" + city.getDistrict() + "%");
        }

        example.orderBy("id").desc();
        List<City> cityList = cityMapper.selectByExample(example);

        return cityList;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveCity(City city) throws Exception {

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        cityMapper.insert(city);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateCity(City city) {
        cityMapper.updateByPrimaryKeySelective(city);
        // cityMapper.updateByPrimaryKey(city);
    }

}
