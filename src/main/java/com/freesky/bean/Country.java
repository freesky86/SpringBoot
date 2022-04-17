package com.freesky.bean;

import javax.persistence.Column;
import javax.persistence.Id;

public class Country {
    @Id
    @Column(name = "Code")
    private String code;

    @Column
    private String continent;

    @Column(name = "Name")
    private String name;

    @Column
    private String region;

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @return the continent
     */
    public String getContinent() {
        return continent;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @param continent the continent to set
     */
    public void setContinent(String continent) {
        this.continent = continent;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(String region) {
        this.region = region;
    }

}
