package com.freesky.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.freesky.bean.City;
import com.freesky.service.CityService;

@Controller
@RequestMapping("city")
public class CityController {

    @Autowired
    private CityService cityService;

    /**
     * localhost:8080/city/pagination?page=2
     * 
     * @param page 查询第几页
     * @param model 返回数据,相当于SpringMVC里面的ModelAndView
     * @return
     */
    @RequestMapping("pagination")
    public String queryCityListPagination(Integer page, ModelMap model) {
        if (page == null) {
            page = 1;
        }
        int pageSize = 10;

        City city = new City();
        city.setDistrict("anhui");
        List<City> cityList = cityService.queryCityListPaged(city, page, pageSize);
        model.addAttribute("cityList", cityList);

        return "thymeleaf/city";
    }
}
