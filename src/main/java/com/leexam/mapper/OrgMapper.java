package com.leexam.mapper;

import com.leexam.entity.Org;
import org.apache.ibatis.annotations.Mapper;

/**
*@author 窦康泰
*@date 2021/01/05
*/
@Mapper
public interface OrgMapper {
    int deleteByPrimaryKey(Integer oid);

    int insert(Org record);

    int insertSelective(Org record);

    Org selectByPrimaryKey(Integer oid);

    int updateByPrimaryKeySelective(Org record);

    int updateByPrimaryKey(Org record);
}