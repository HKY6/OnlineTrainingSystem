package com.iqiaoxu.train.user.controller;

import com.iqiaoxu.train.user.entity.EmergencyContact;
import com.iqiaoxu.train.user.service.IEmergencyContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/7/1 15:51
 */
@RestController
@RequestMapping("/emergency-contacts")
public class EmergencyContactController {
    @Autowired
    private IEmergencyContactService emergencyContactService;

    @GetMapping("/{id}")
    public EmergencyContact getEmergencyContact(@PathVariable("id") int id){
        return emergencyContactService.getEmergencyContact(id);
    }

    @GetMapping
    public List<EmergencyContact> getEmergencyContacts(@RequestParam("idno") int idno){
        return emergencyContactService.getEmergencyContacts(idno);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addEmergencyContacts(@RequestBody EmergencyContact... contacts){
        int affected = emergencyContactService.addEmergencyContacts(contacts);
    }

    @PutMapping("/{id}")
    public EmergencyContact modifyEmergencyContact(@PathVariable("id")int id,@RequestBody EmergencyContact contact){
        contact.setId(id);
        int affected = emergencyContactService.modifyEmergencyContact(contact);
        return null;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeEmergencyContact(@PathVariable("id")int id){
        int affected = emergencyContactService.removeEmergencyContact(id);
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello! this is emergency contacts controller!";
    }
}
