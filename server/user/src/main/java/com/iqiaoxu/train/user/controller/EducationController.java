package com.iqiaoxu.train.user.controller;

import com.iqiaoxu.train.user.entity.Education;
import com.iqiaoxu.train.user.service.IEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/7/1 15:48
 */
@RestController
@RequestMapping("/educations")
public class EducationController {
    @Autowired
    private IEducationService educationService;

    @GetMapping("{id}")
    public Education getEducation(@PathVariable("id") int id){
        return educationService.getEducation(id);
    }

    @GetMapping()
    public List<Education> getEducations(@RequestParam("idno") int idno){
        return educationService.getEducations(idno);
    }

    @PostMapping
    public void addEducations(Education... educations){
        //return educationService.addEducations(educations);
    }

    @PutMapping("{id}")
    public void modifyEducation(@PathVariable("id")int id,Education education){

    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello! this is educations controller!";
    }
}
