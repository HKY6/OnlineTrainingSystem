/*
Navicat MySQL Data Transfer

Source Server         : 211.71.233.113
Source Server Version : 50720
Source Host           : 211.71.233.113:3306
Source Database       : chinasafetydb

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2019-06-30 22:01:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for certificate
-- ----------------------------
DROP TABLE IF EXISTS `certificate`;
CREATE TABLE `certificate` (
  `certificate_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_idno` varchar(18) NOT NULL,
  `certificate_no` varchar(200) DEFAULT NULL,
  `certificate_name` varchar(200) NOT NULL,
  `certificate_org` varchar(200) DEFAULT NULL,
  `certificate_enddate` date DEFAULT NULL,
  `certificate_photo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`certificate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Table structure for education
-- ----------------------------
DROP TABLE IF EXISTS `education`;
CREATE TABLE `education` (
  `edu_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_idno` varchar(18) NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date DEFAULT NULL,
  `education` varchar(100) DEFAULT NULL,
  `university` varchar(100) DEFAULT NULL,
  `major` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`edu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Table structure for emergencycontact
-- ----------------------------
DROP TABLE IF EXISTS `emergencycontact`;
CREATE TABLE `emergencycontact` (
  `emergency_id` int(11) NOT NULL AUTO_INCREMENT,
  `emergency_name` varchar(20) DEFAULT NULL,
  `emergency_address` varchar(255) DEFAULT NULL,
  `emergency_tel` varchar(255) DEFAULT NULL,
  `user_idno` varchar(18) DEFAULT NULL,
  PRIMARY KEY (`emergency_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `news_id` int(11) NOT NULL AUTO_INCREMENT,
  `news_title` varchar(255) NOT NULL,
  `news_content` text,
  PRIMARY KEY (`news_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_idno` varchar(18) NOT NULL COMMENT '身份证号码',
  `user_email` varchar(100) NOT NULL COMMENT '邮箱',
  `user_tel` varchar(16) NOT NULL COMMENT '手机',
  `user_name` varchar(20) NOT NULL COMMENT '名字',
  `user_avatar` varchar(128) DEFAULT NULL COMMENT '照片',
  `user_pwd` varchar(64) NOT NULL COMMENT 'hash存储密码',
  `user_salt` varchar(16) NOT NULL COMMENT '盐',
  `user_gender` tinyint(1) DEFAULT NULL,
  `user_brithday` date DEFAULT NULL COMMENT '生日',
  `user_address` varchar(200) DEFAULT NULL COMMENT '通讯地址',
  `user_zip` varchar(6) DEFAULT NULL COMMENT '邮编',
  `user_national` varchar(20) DEFAULT NULL COMMENT '民族',
  `user_politics` varchar(20) DEFAULT NULL COMMENT '政治面貌',
  `user_role` tinyint(2) DEFAULT NULL COMMENT '角色',
  `user_status` tinyint(2) NOT NULL DEFAULT '0',
  `user_photo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_idno`),
  UNIQUE KEY `user_email_UNIQUE` (`user_email`),
  UNIQUE KEY `user_tel` (`user_tel`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Table structure for workexperience
-- ----------------------------
DROP TABLE IF EXISTS `workexperience`;
CREATE TABLE `workexperience` (
  `work_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_idno` varchar(18) NOT NULL,
  `start_date` date DEFAULT NULL,
  `end_datte` date DEFAULT NULL,
  `work_org` varchar(255) DEFAULT NULL,
  `work_duty` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`work_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;
