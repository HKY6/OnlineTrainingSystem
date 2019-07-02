package com.iqiaoxu.train.user.service;

import com.iqiaoxu.train.user.entity.Education;

import java.util.List;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/7/1 15:56
 */
public interface IEducationService {
    Education getEducation(int id);

    List<Education> getEducations(int idno);

    int addEducations(Education[] educations);

    int modifyEducation(Education education);

    int removeEducation(int id);
}
