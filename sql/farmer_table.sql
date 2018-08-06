/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50539
Source Host           : localhost:3306
Source Database       : seed

Target Server Type    : MYSQL
Target Server Version : 50539
File Encoding         : 65001

Date: 2018-08-06 16:57:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for farmer_table
-- ----------------------------
DROP TABLE IF EXISTS `farmer_table`;
CREATE TABLE `farmer_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `farmers_address` varchar(255) DEFAULT NULL,
  `farmers_id` varchar(255) DEFAULT NULL,
  `farmers_name` varchar(255) DEFAULT NULL,
  `farmers_sex` varchar(255) DEFAULT NULL,
  `farmers_telephone` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of farmer_table
-- ----------------------------
INSERT INTO `farmer_table` VALUES ('5', '浙江', 'SF189732', '张三', null, '123456789', '123456');
INSERT INTO `farmer_table` VALUES ('6', '北京', 'SF657144', '李四', null, '18164902933', '123456');
