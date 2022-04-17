package com.freesky.repository;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.freesky.bean.Country;

//@Repository
public interface CountryRepository extends BaseMapper<Country> {

    List<Country> getCountryList(String code);
}
