package com.lawu.compensating.transaction.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.lawu.compensating.transaction.domain.ShoppingOrderDO;
import com.lawu.compensating.transaction.domain.ShoppingOrderDOExample;

public interface ShoppingOrderDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_order
     *
     * @mbg.generated
     */
    long countByExample(ShoppingOrderDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_order
     *
     * @mbg.generated
     */
    int deleteByExample(ShoppingOrderDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_order
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_order
     *
     * @mbg.generated
     */
    int insert(ShoppingOrderDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_order
     *
     * @mbg.generated
     */
    int insertSelective(ShoppingOrderDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_order
     *
     * @mbg.generated
     */
    List<ShoppingOrderDO> selectByExampleWithRowbounds(ShoppingOrderDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_order
     *
     * @mbg.generated
     */
    List<ShoppingOrderDO> selectByExample(ShoppingOrderDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_order
     *
     * @mbg.generated
     */
    ShoppingOrderDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_order
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShoppingOrderDO record, @Param("example") ShoppingOrderDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_order
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShoppingOrderDO record, @Param("example") ShoppingOrderDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShoppingOrderDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ShoppingOrderDO record);
}