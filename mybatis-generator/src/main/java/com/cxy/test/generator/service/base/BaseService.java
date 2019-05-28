package com.cxy.test.generator.service.base;

import java.util.List;

/**
 * @author Wang926454
 * @date 2018/8/9 15:45
 */
public interface BaseService<T> {

    // Select

    /**
     * 根据实体中的属性值进行查询，查询条件使用等号
     *
     * @param record
     * @return java.util.List<T>
     * @author Wang926454
     * @date 2018/8/9 15:43
     */
    List<T> select(T record);

    /**
     * 根据主键字段进行查询，方法参数必须包含完整的主键属性，查询条件使用等号
     *
     * @param key
     * @return T
     * @author Wang926454
     * @date 2018/8/9 15:43
     */
    T selectByPrimaryKey(Object key);

    /**
     * 查询全部结果，select(null)方法能达到同样的效果
     *
     * @param
     * @return java.util.List<T>
     * @author Wang926454
     * @date 2018/8/9 15:43
     */
    List<T> selectAll();

    /**
     * 根据实体中的属性进行查询，只能有一个返回值，有多个结果是抛出异常，查询条件使用等号
     *
     * @param record
     * @return T
     * @author Wang926454
     * @date 2018/8/9 15:43
     */
    T selectOne(T record);

    /**
     * 根据实体中的属性查询总数，查询条件使用等号
     *
     * @param record
     * @return int
     * @author Wang926454
     * @date 2018/8/9 15:43
     */
    int selectCount(T record);

    // Insert

    /**
     * 保存一个实体，null的属性也会保存，不会使用数据库默认值
     *
     * @param record
     * @return int
     * @author Wang926454
     * @date 2018/8/9 15:43
     */
    int insert(T record);

    /**
     * 保存一个实体，null的属性不会保存，会使用数据库默认值
     *
     * @param record
     * @return int
     * @author Wang926454
     * @date 2018/8/9 15:43
     */
    int insertSelective(T record);

    // Update

    /**
     * 根据主键更新实体全部字段，null值会被更新
     *
     * @param record
     * @return int
     * @author Wang926454
     * @date 2018/8/9 15:43
     */
    int updateByPrimaryKey(T record);

    /**
     * 根据主键更新属性不为null的值
     *
     * @param record
     * @return int
     * @author Wang926454
     * @date 2018/8/9 15:43
     */
    int updateByPrimaryKeySelective(T record);

    // Delete

    /**
     * 根据实体属性作为条件进行删除，查询条件使用等号
     *
     * @param record
     * @return int
     * @author Wang926454
     * @date 2018/8/9 15:43
     */
    int delete(T record);

    /**
     * 根据主键字段进行删除，方法参数必须包含完整的主键属性
     *
     * @param key
     * @return int
     * @author Wang926454
     * @date 2018/8/9 15:44
     */
    int deleteByPrimaryKey(Object key);
}
