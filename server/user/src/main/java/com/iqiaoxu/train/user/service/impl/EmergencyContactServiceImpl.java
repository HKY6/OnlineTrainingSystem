package com.iqiaoxu.train.user.service.impl;

import com.iqiaoxu.train.user.dao.EmergencyContactMapper;
import com.iqiaoxu.train.user.entity.EmergencyContact;
import com.iqiaoxu.train.user.service.IEmergencyContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/7/1 15:58
 */
@Service
public class EmergencyContactServiceImpl implements IEmergencyContactService {
    @Autowired
    private EmergencyContactMapper emergencyContactMapper;

    @Override
    public EmergencyContact getEmergencyContact(int id) {
        return emergencyContactMapper.selectEmergencyContact(id);
    }

    @Override
    public List<EmergencyContact> getEmergencyContacts(int userId) {
        return emergencyContactMapper.selectEmergencyContacts(userId);
    }

    @Override
    public int addEmergencyContacts(EmergencyContact[] contacts) {
        return emergencyContactMapper.insertEmergencyContacts(contacts);
    }

    @Override
    public int modifyEmergencyContact(EmergencyContact contact) {
        return emergencyContactMapper.updateEmergencyContact(contact);
    }

    @Override
    public int removeEmergencyContact(int id) {
        return emergencyContactMapper.deleteEmergencyContact(id);
    }
}
