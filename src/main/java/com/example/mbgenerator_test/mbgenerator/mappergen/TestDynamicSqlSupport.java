package com.example.mbgenerator_test.mbgenerator.mappergen;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class TestDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: test")
    public static final Test test = new Test();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: test.id")
    public static final SqlColumn<Integer> id = test.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: test.username")
    public static final SqlColumn<String> username = test.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: test")
    public static final class Test extends AliasableSqlTable<Test> {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public Test() {
            super("test", Test::new);
        }
    }
}