package com.example.mbgenerator_test.mbgenerator.mappergen;

import static com.example.mbgenerator_test.mbgenerator.mappergen.TestDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.example.mbgenerator_test.mbgenerator.modelgen.Test;
import jakarta.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface TestMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Test>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: test")
    BasicColumn[] selectList = BasicColumn.columnList(id, username);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: test")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TestResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR)
    })
    List<Test> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: test")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TestResult")
    Optional<Test> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: test")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, test, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: test")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, test, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: test")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: test")
    default int insert(Test row) {
        return MyBatis3Utils.insert(this::insert, row, test, c ->
            c.map(id).toProperty("id")
            .map(username).toProperty("username")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: test")
    default int insertMultiple(Collection<Test> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, test, c ->
            c.map(id).toProperty("id")
            .map(username).toProperty("username")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: test")
    default int insertSelective(Test row) {
        return MyBatis3Utils.insert(this::insert, row, test, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(username).toPropertyWhenPresent("username", row::getUsername)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: test")
    default Optional<Test> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, test, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: test")
    default List<Test> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, test, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: test")
    default List<Test> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, test, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: test")
    default Optional<Test> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: test")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, test, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: test")
    static UpdateDSL<UpdateModel> updateAllColumns(Test row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(username).equalTo(row::getUsername);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: test")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Test row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(username).equalToWhenPresent(row::getUsername);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: test")
    default int updateByPrimaryKey(Test row) {
        return update(c ->
            c.set(username).equalTo(row::getUsername)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: test")
    default int updateByPrimaryKeySelective(Test row) {
        return update(c ->
            c.set(username).equalToWhenPresent(row::getUsername)
            .where(id, isEqualTo(row::getId))
        );
    }
}