package com.iqiaoxu.train.user.service.impl;

import com.iqiaoxu.train.user.dao.WorkExperienceMapper;
import com.iqiaoxu.train.user.service.IWorkExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/7/1 15:57
 */
@Service
public class WorkExperienceServiceService implements IWorkExperienceService {
    @Autowired
    private WorkExperienceMapper workExperienceMapper;
}
