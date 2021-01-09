package com.leexam.mapper;

import com.leexam.entity.QuesBank;
import com.leexam.entity.Question;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
*@author 窦康泰
*@date 2021/01/05
*/
@Mapper
public interface QuesBankMapper {
    int deleteByPrimaryKey(Integer qbid);

    int insert(QuesBank record);

    int insertSelective(QuesBank record);

    QuesBank selectByPrimaryKey(Integer qbid);

    int updateByPrimaryKeySelective(QuesBank record);

    int updateByPrimaryKey(QuesBank record);

    @Select("select * from ques_bank where oid=#{oid} order by update_time")
    @Results(id="timeMap",value = {
            @Result(column = "create_time",property = "createTime"),
            @Result(column = "update_time",property = "updateTime")
    })
    List<QuesBank> findByOid(int oid);

    @Insert("insert into ques_bank(qbname,create_time,update_time,oid) values(#{qbname},#{createTime},#{updateTime},#{oid})")
    int insertBank(QuesBank quesBank);

    @Select("select * from ques_bank where qbname like concat('%',#{qbname},'%') and oid = #{oid} order by update_time")
    @ResultMap(value = {"timeMap"})
    List<QuesBank> findByQbname(String qbname,int oid);

    @Select("select count(*) from question where difficult=#{difficult}")
    int findBydiff(int difficult);

    @Select("SELECT question from ques_bank WHERE qbid = #{qbid}")
    String findAlltype(int qbid);


    List<Map<String,Object>> findBytype(Integer[] q);

    @Update("UPDATE ques_bank set question=#{question} WHERE qbid=#{qbid}")
    int intoBank(String question,int qbid);
}