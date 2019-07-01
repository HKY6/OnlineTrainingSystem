-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: 192.168.52.30    Database: chinasafetydb
-- ------------------------------------------------------
-- Server version	5.7.25-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `certificate`
--

DROP TABLE IF EXISTS `certificate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `education`
--

DROP TABLE IF EXISTS `education`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `education` (
  `edu_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '教育经历ID',
  `user_idno` varchar(18) NOT NULL COMMENT '身份证号码',
  `start_date` date NOT NULL COMMENT '开始时间',
  `end_date` date DEFAULT NULL COMMENT '结束时间',
  `education` varchar(100) DEFAULT NULL COMMENT '学历',
  `university` varchar(100) DEFAULT NULL COMMENT '大学',
  `major` varchar(100) DEFAULT NULL COMMENT '专业',
  PRIMARY KEY (`edu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312 COMMENT='教育经历表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `emergencycontact`
--

DROP TABLE IF EXISTS `emergencycontact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `emergencycontact` (
  `emergency_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `emergency_name` varchar(20) DEFAULT NULL COMMENT '紧急联系人姓名',
  `emergency_address` varchar(255) DEFAULT NULL COMMENT '紧急联系人地址',
  `emergency_tel` varchar(255) DEFAULT NULL COMMENT '紧急联系人电话',
  `user_idno` varchar(18) DEFAULT NULL COMMENT '用户身份证号码',
  PRIMARY KEY (`emergency_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312 COMMENT='紧急联系人表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `news` (
  `news_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `news_title` varchar(255) NOT NULL COMMENT '标题',
  `news_content` text COMMENT '内容',
  PRIMARY KEY (`news_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312 COMMENT='新闻表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user` (
  `user_idno` varchar(18) NOT NULL COMMENT '身份证号码',
  `user_email` varchar(100) NOT NULL COMMENT '邮箱',
  `user_tel` varchar(16) NOT NULL COMMENT '手机',
  `user_name` varchar(20) NOT NULL COMMENT '名字',
  `user_photo` varchar(255) DEFAULT NULL COMMENT '照片',
  `user_pwd` varchar(64) NOT NULL COMMENT 'hash存储密码',
  `user_salt` varchar(16) NOT NULL COMMENT '盐',
  `user_gender` tinyint(1) DEFAULT NULL COMMENT '性别',
  `user_brithday` date DEFAULT NULL COMMENT '生日',
  `user_address` varchar(200) DEFAULT NULL COMMENT '通讯地址',
  `user_zip` varchar(6) DEFAULT NULL COMMENT '邮编',
  `user_national` varchar(20) DEFAULT NULL COMMENT '民族',
  `user_politics` varchar(20) DEFAULT NULL COMMENT '政治面貌',
  `user_role` tinyint(2) DEFAULT NULL COMMENT '角色',
  `user_status` tinyint(2) NOT NULL DEFAULT '0' COMMENT '状态',
  PRIMARY KEY (`user_idno`),
  UNIQUE KEY `user_email_UNIQUE` (`user_email`),
  UNIQUE KEY `user_tel` (`user_tel`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=gb2312 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `workexperience`
--

DROP TABLE IF EXISTS `workexperience`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `workexperience` (
  `work_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_idno` varchar(18) NOT NULL COMMENT '用户身份证号码',
  `start_date` date DEFAULT NULL COMMENT '开始时间',
  `end_date` date DEFAULT NULL COMMENT '结束时间',
  `work_org` varchar(255) DEFAULT NULL COMMENT '工作单位',
  `work_duty` varchar(255) DEFAULT NULL COMMENT '职务',
  PRIMARY KEY (`work_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312 COMMENT='工作经历表';
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-01 15:10:28
