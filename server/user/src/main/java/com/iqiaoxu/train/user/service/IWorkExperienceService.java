package com.iqiaoxu.train.user.service;

import com.iqiaoxu.train.user.entity.WorkExperience;

import java.util.List;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/7/1 15:54
 */
public interface IWorkExperienceService {
    WorkExperience getWorkExperience(int id);

    List<WorkExperience> getWorkExperiences(int userId);

    List<WorkExperience> addWorkExperiences(WorkExperience[] workExperiences);

    WorkExperience modifyWorkExperience(WorkExperience experience);

    int removeWorkExperience(int id);
}
