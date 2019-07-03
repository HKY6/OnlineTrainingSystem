package com.iqiaoxu.train.user.service.impl;

import com.iqiaoxu.train.user.dao.WorkExperienceMapper;
import com.iqiaoxu.train.user.entity.WorkExperience;
import com.iqiaoxu.train.user.service.IWorkExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/7/1 15:57
 */
@Service
public class WorkExperienceServiceImpl implements IWorkExperienceService {
    @Autowired
    private WorkExperienceMapper workExperienceMapper;

    @Override
    public WorkExperience getWorkExperience(int id) {
        return workExperienceMapper.selectWorkExperience(id);
    }

    @Override
    public List<WorkExperience> getWorkExperiences(int userId) {
        return workExperienceMapper.selectWorkExperiences(userId);
    }

    @Override
    public List<WorkExperience> addWorkExperiences(WorkExperience[] workExperiences) {
        int affected = workExperienceMapper.insertWorkExperiences(workExperiences);
        return Arrays.asList(workExperiences);
    }

    @Override
    public WorkExperience modifyWorkExperience(WorkExperience experience) {
        int affected = workExperienceMapper.updateWorkExperience(experience);
        return experience;
    }

    @Override
    public int removeWorkExperience(int id) {
        return workExperienceMapper.deleteWorkExperience(id);
    }
}
