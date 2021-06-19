package com.freesky.controller;

//import java.util.Date;
import java.util.List;

//import org.n3r.idworker.Sid;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.freesky.bean.City;
import com.freesky.bean.IMoocJSONResult;
import com.freesky.service.CityService;

@RestController
@RequestMapping("mybatis")
public class MyBatisCRUDController {

    @Autowired
    private CityService cityService;

    // @Autowired
    // private Sid sid;

    @RequestMapping("/deleteCity")
    public IMoocJSONResult deleteCity(String cityId) {

        cityService.deleteCity(cityId);

        return IMoocJSONResult.ok("删除成功");
    }

    @RequestMapping("/queryCityById")
    public IMoocJSONResult queryCityById(String cityId) {

        return IMoocJSONResult.ok(cityService.queryCityById(cityId));
    }

    @RequestMapping("/queryCityByIdCustom")
    public IMoocJSONResult queryCityByIdCustom(Integer id) {
        // http://localhost:8080/mybatis/queryCityByIdCustom?id=1916
        return IMoocJSONResult.ok(cityService.queryCityByIdCustom(id));
    }

    @RequestMapping("/queryCityByLanguageCustom")
    public IMoocJSONResult queryCityByLanguageCustom(String language) {
        // http://localhost:8080/mybatis/queryCityByLanguageCustom?language=Malay
        // http://localhost:8080/mybatis/queryCityByLanguageCustom?language=Kongo
        return IMoocJSONResult.ok(cityService.queryCityByLanguageCustom(language));
    }

    @RequestMapping("/queryCityList")
    public IMoocJSONResult queryCityList() {

        City city = new City();
        // city.setName("Fuyang");
        city.setDistrict("anhui");

        List<City> cityList = cityService.queryCityList(city);

        return IMoocJSONResult.ok(cityList);
    }

    @RequestMapping("/queryCityListPaged")
    public IMoocJSONResult queryCityListPaged(Integer page) {

        if (page == null) {
            page = 1;
        }

        int pageSize = 10;

        City city = new City();
        city.setDistrict("shandong");

        List<City> cityList = cityService.queryCityListPaged(city, page, pageSize);

        return IMoocJSONResult.ok(cityList);
    }

    @RequestMapping("/saveCity")
    public IMoocJSONResult saveCity() throws Exception {

        // String cityId = sid.nextShort();

        City city = new City();
        // city.setId(cityId);
        city.setCountrycode("CHN");
        city.setDistrict("Fuyang");
        city.setName("Jieshou");
        city.setPopulation(12306);

        cityService.saveCity(city);

        return IMoocJSONResult.ok("保存成功");
    }

    @RequestMapping("/updateCity")
    public IMoocJSONResult updateCity(@RequestParam(name = "id", required = false, defaultValue = "4080") String id) {
        System.err.println("Param(id): " + id);
        int cityId = Integer.parseInt(id);

        City city = new City();
        city.setId(cityId);
        city.setCountrycode("CHN");
        city.setDistrict("Jieshou6");
        city.setName("Shenqiu6");
        city.setPopulation(123456789);

        cityService.updateCity(city);

        return IMoocJSONResult.ok("更新成功");
    }

}
