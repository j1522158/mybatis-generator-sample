package com.example.mbgenerator.modelgen;

import jakarta.annotation.Generated;

public class Item {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: Item.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: Item.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: Item.price")
    private Integer price;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: Item.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: Item.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: Item.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: Item.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: Item.price")
    public Integer getPrice() {
        return price;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: Item.price")
    public void setPrice(Integer price) {
        this.price = price;
    }
}