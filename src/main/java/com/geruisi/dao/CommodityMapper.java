package com.geruisi.dao;

import com.geruisi.bean.Commodity;
import com.geruisi.bean.CommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityMapper {
	
    long countByExample(CommodityExample example);

    int deleteByExample(CommodityExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(Commodity record);

    int insertSelective(Commodity record);
    
    //查询商品信息并且带店铺名称的
    List<Commodity> selectByExampleMer(CommodityExample example);

    //按条件查找所有商品
    List<Commodity> selectCommodityAll();

    List<Commodity> selectByExample(CommodityExample example);

    Commodity selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") Commodity record, @Param("example") CommodityExample example);

    int updateByExample(@Param("record") Commodity record, @Param("example") CommodityExample example);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);
}