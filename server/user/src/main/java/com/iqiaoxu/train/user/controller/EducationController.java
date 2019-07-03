package com.iqiaoxu.train.user.controller;

import com.iqiaoxu.train.user.entity.Education;
import com.iqiaoxu.train.user.service.IEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public List<Education> getEducations(@RequestParam("user-id") int userId){
        return educationService.getEducations(userId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addEducations(@RequestBody Education... educations){
        educationService.addEducations(educations);
    }

    @PutMapping("/{id}")
    public Education modifyEducation(@PathVariable("id")int id,@RequestBody Education education){
        education.setId(id);
        educationService.modifyEducation(education);
        return education;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeEducation(@PathVariable("id")int id){
        educationService.removeEducation(id);
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello! this is educations controller!";
    }
}
