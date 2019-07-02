package com.iqiaoxu.train.user.dao;

import com.iqiaoxu.train.user.entity.WorkExperience;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/7/1 15:43
 */
@Mapper
public interface WorkExperienceMapper {
    WorkExperience selectWorkExperience(int id);

    List<WorkExperience> selectWorkExperiences(int idno);

    int insertWorkExperiences(WorkExperience[] workExperiences);

    int updateWorkExperience(WorkExperience experience);

    int deleteWorkExperience(int id);
}
