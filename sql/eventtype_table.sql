/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50539
Source Host           : localhost:3306
Source Database       : seed

Target Server Type    : MYSQL
Target Server Version : 50539
File Encoding         : 65001

Date: 2018-08-06 16:57:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for eventtype_table
-- ----------------------------
DROP TABLE IF EXISTS `eventtype_table`;
CREATE TABLE `eventtype_table` (
  `id` int(11) NOT NULL,
  `event_type` varchar(255) DEFAULT NULL,
  `farmerId` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of eventtype_table
-- ----------------------------
INSERT INTO `eventtype_table` VALUES ('1', '施肥', 'SF189732');
INSERT INTO `eventtype_table` VALUES ('2', '喷洒农药', 'SF189732');
INSERT INTO `eventtype_table` VALUES ('3', '除草', 'SF189732');
INSERT INTO `eventtype_table` VALUES ('4', '播种', 'SF189732');
INSERT INTO `eventtype_table` VALUES ('5', '收获', 'SF189732');
INSERT INTO `eventtype_table` VALUES ('6', '施肥', 'SF657144');
INSERT INTO `eventtype_table` VALUES ('7', '喷洒农药', 'SF657144');
INSERT INTO `eventtype_table` VALUES ('8', '除草', 'SF657144');
INSERT INTO `eventtype_table` VALUES ('9', '播种', 'SF657144');
INSERT INTO `eventtype_table` VALUES ('10', '收获', 'SF657144');
