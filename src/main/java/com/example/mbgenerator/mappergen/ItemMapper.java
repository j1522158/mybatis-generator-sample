package com.example.mbgenerator.mappergen;

import static com.example.mbgenerator.mappergen.ItemDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.example.mbgenerator.modelgen.Item;
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
public interface ItemMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Item>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: Item")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, price);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: Item")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ItemResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER)
    })
    List<Item> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: Item")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ItemResult")
    Optional<Item> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: Item")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, item, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: Item")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, item, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: Item")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: Item")
    default int insert(Item row) {
        return MyBatis3Utils.insert(this::insert, row, item, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(price).toProperty("price")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: Item")
    default int insertMultiple(Collection<Item> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, item, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(price).toProperty("price")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: Item")
    default int insertSelective(Item row) {
        return MyBatis3Utils.insert(this::insert, row, item, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(price).toPropertyWhenPresent("price", row::getPrice)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: Item")
    default Optional<Item> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, item, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: Item")
    default List<Item> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, item, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: Item")
    default List<Item> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, item, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: Item")
    default Optional<Item> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: Item")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, item, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: Item")
    static UpdateDSL<UpdateModel> updateAllColumns(Item row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(name).equalTo(row::getName)
                .set(price).equalTo(row::getPrice);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: Item")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Item row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(name).equalToWhenPresent(row::getName)
                .set(price).equalToWhenPresent(row::getPrice);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: Item")
    default int updateByPrimaryKey(Item row) {
        return update(c ->
            c.set(name).equalTo(row::getName)
            .set(price).equalTo(row::getPrice)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: Item")
    default int updateByPrimaryKeySelective(Item row) {
        return update(c ->
            c.set(name).equalToWhenPresent(row::getName)
            .set(price).equalToWhenPresent(row::getPrice)
            .where(id, isEqualTo(row::getId))
        );
    }
}