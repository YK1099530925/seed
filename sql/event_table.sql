/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50539
Source Host           : localhost:3306
Source Database       : seed

Target Server Type    : MYSQL
Target Server Version : 50539
File Encoding         : 65001

Date: 2018-08-06 16:57:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for event_table
-- ----------------------------
DROP TABLE IF EXISTS `event_table`;
CREATE TABLE `event_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `event_article_type` varchar(255) DEFAULT NULL,
  `event_article_use` varchar(255) DEFAULT NULL,
  `event_happen_addr` varchar(255) DEFAULT NULL,
  `event_happen_time` datetime DEFAULT NULL,
  `event_recorder` varchar(255) DEFAULT NULL,
  `event_recorder_company` varchar(255) DEFAULT NULL,
  `event_relevant_personnel` varchar(255) DEFAULT NULL,
  `event_type` varchar(255) DEFAULT NULL,
  `farmers_id` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `seed_code` varchar(255) DEFAULT NULL,
  `event_info` varchar(255) DEFAULT NULL,
  `event_time` datetime DEFAULT NULL,
  `land_id` varchar(255) DEFAULT NULL,
  `seed_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of event_table
-- ----------------------------
INSERT INTO `event_table` VALUES ('24', null, null, null, null, null, null, null, '播种', 'SF189732', '', 'sdfa5465as', '', '2018-08-06 15:22:14', '0', '四季豆');
INSERT INTO `event_table` VALUES ('25', null, null, null, null, null, null, null, '施肥', 'SF189732', '', 'sdfa5465as', '化肥123', '2018-08-06 15:27:05', '0', '四季豆');
INSERT INTO `event_table` VALUES ('26', null, null, null, null, null, null, null, '喷洒农药', 'SF189732', '', 'sdfa5465as', '敌敌畏456', '2018-08-06 15:27:24', '0', '四季豆');
INSERT INTO `event_table` VALUES ('27', null, null, null, null, null, null, null, '除草', 'SF189732', '', 'sdfa5465as', '除草剂789', '2018-08-06 15:27:42', '0', '四季豆');
INSERT INTO `event_table` VALUES ('30', null, null, null, null, null, null, null, '播种', 'SF189732', '', 'gd8fg8e5r6', '播种', '2018-08-06 15:39:39', '2', '豇豆');
INSERT INTO `event_table` VALUES ('29', null, null, null, null, null, null, null, '收获', 'SF189732', '', 'sdfa5465as', '收获', '2018-08-06 15:36:31', '0', '四季豆');
