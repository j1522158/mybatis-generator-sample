package com.example.mbgenerator_test.mbgenerator.mappergen;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class ItemDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: item")
    public static final Item item = new Item();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: item.id")
    public static final SqlColumn<Integer> id = item.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: item.name")
    public static final SqlColumn<String> name = item.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: item.price")
    public static final SqlColumn<Integer> price = item.price;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: item")
    public static final class Item extends AliasableSqlTable<Item> {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> price = column("price", JDBCType.INTEGER);

        public Item() {
            super("item", Item::new);
        }
    }
}