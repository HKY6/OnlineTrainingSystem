package com.iqiaoxu.train.user.service;

import com.iqiaoxu.train.user.entity.EmergencyContact;

import java.util.List;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/7/1 15:56
 */
public interface IEmergencyContactService {
    EmergencyContact getEmergencyContact(int id);

    List<EmergencyContact> getEmergencyContacts(int userId);

    int addEmergencyContacts(EmergencyContact[] contacts);

    int modifyEmergencyContact(EmergencyContact contact);

    int removeEmergencyContact(int id);
}
