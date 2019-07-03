package com.iqiaoxu.train.user.dao;

import com.iqiaoxu.train.user.entity.EmergencyContact;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/7/1 15:45
 */
@Mapper
public interface EmergencyContactMapper {
    EmergencyContact selectEmergencyContact(int id);

    List<EmergencyContact> selectEmergencyContacts(int userId);

    int insertEmergencyContacts(EmergencyContact[] contacts);

    int updateEmergencyContact(EmergencyContact contact);

    int deleteEmergencyContact(int id);
}
