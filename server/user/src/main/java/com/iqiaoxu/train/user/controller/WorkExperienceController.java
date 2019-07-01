package com.iqiaoxu.train.user.controller;

import com.iqiaoxu.train.user.service.IWorkExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/7/1 15:53
 */
@RestController
@RequestMapping("/work-experience")
public class WorkExperienceController {
    @Autowired
    private IWorkExperienceService workExperienceService;
}
