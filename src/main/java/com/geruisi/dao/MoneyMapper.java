package com.geruisi.dao;

import com.geruisi.bean.Money;
import com.geruisi.bean.MoneyExample;
import com.geruisi.bean.MoneyKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoneyMapper {
    long countByExample(MoneyExample example);

    int deleteByExample(MoneyExample example);

    int deleteByPrimaryKey(MoneyKey key);

    int insert(Money record);

    int insertSelective(Money record);

    List<Money> selectByExample(MoneyExample example);

    Money selectByPrimaryKey(MoneyKey key);
    
    Money selectByKey(String strNmnber);

    int updateByExampleSelective(@Param("record") Money record, @Param("example") MoneyExample example);

    int updateByExample(@Param("record") Money record, @Param("example") MoneyExample example);

    int updateByPrimaryKeySelective(Money record);

    int updateByPrimaryKey(Money record);
}