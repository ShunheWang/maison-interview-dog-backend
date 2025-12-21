package com.maison.interviewdog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.maison.interviewdog.model.entity.Question;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

/**
* @author shunhewang
* @description 针对表【question(题目)】的数据库操作Mapper
* @createDate 2025-11-29 11:24:13
* @Entity com.maison.interviewdog.model.entity.Question
*/
public interface QuestionMapper extends BaseMapper<Question> {

    /**
     * 查询题目列表（包括已被删除的数据）
     */
    @Select("select * from question where updateTime >= #{minUpdateTime}")
    List<Question> listQuestionWithDelete(Date minUpdateTime);
}




