package com.example.mbgenerator_test.mbgenerator.modelgen;

import jakarta.annotation.Generated;

public class Item {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: item.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: item.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: item.price")
    private Integer price;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: item.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: item.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: item.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: item.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: item.price")
    public Integer getPrice() {
        return price;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: item.price")
    public void setPrice(Integer price) {
        this.price = price;
    }
}