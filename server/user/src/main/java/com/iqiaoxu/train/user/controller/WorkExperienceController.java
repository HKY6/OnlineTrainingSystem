package com.iqiaoxu.train.user.controller;

import com.iqiaoxu.train.user.entity.WorkExperience;
import com.iqiaoxu.train.user.service.IWorkExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/7/1 15:53
 */
@RestController
@RequestMapping("/work-experiences")
public class WorkExperienceController {
    @Autowired
    private IWorkExperienceService workExperienceService;

    @GetMapping("/{id}")
    public WorkExperience getWorkExperience(@PathVariable("id")int id){
        return workExperienceService.getWorkExperience(id);
    }

    @GetMapping
    public List<WorkExperience> getWorkExperiences(@RequestParam("user-id")int userId){
        return workExperienceService.getWorkExperiences(userId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<WorkExperience> addWorkExperiences(@RequestBody WorkExperience... workExperiences){
        return workExperienceService.addWorkExperiences(workExperiences);
    }

    @PutMapping("/{id}")
    public WorkExperience modifyWorkExperience(@PathVariable("id") int id, @RequestBody WorkExperience experience){
        experience.setId(id);
        return workExperienceService.modifyWorkExperience(experience);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeWorkExperience(@PathVariable("id") int id){
        int affected = workExperienceService.removeWorkExperience(id);
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello! this is work experiences controller!";
    }
}
