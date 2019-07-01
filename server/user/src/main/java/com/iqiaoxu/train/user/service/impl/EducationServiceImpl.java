package com.iqiaoxu.train.user.service.impl;

import com.iqiaoxu.train.user.dao.EducationMapper;
import com.iqiaoxu.train.user.entity.Education;
import com.iqiaoxu.train.user.service.IEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/7/1 15:57
 */
@Service
public class EducationServiceImpl implements IEducationService {
    @Autowired
    private EducationMapper educationMapper;

    @Override
    public Education getEducation(int id) {
        return educationMapper.selectEducationById(id);
    }

    @Override
    public List<Education> getEducations(int idno) {
        return educationMapper.selectEducationsByIdNo(idno);
    }
}
