package com.iqiaoxu.train.user.dao;

import com.iqiaoxu.train.user.entity.Education;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/7/1 15:40
 */
@Mapper
public interface EducationMapper {
    Education selectEducationById(int id);

    List<Education> selectEducationsByIdNo(int idno);
}
