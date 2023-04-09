package com.coh.dao;

import com.coh.pojo.Doll;
import com.coh.pojo.DollExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DollDao {
    long countByExample(DollExample example);

    int deleteByExample(DollExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Doll record);

    int insertSelective(Doll record);

    List<Doll> selectByExample(DollExample example);

    Doll selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Doll record, @Param("example") DollExample example);

    int updateByExample(@Param("record") Doll record, @Param("example") DollExample example);

    int updateByPrimaryKeySelective(Doll record);

    int updateByPrimaryKey(Doll record);
}