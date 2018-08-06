/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50539
Source Host           : localhost:3306
Source Database       : seed

Target Server Type    : MYSQL
Target Server Version : 50539
File Encoding         : 65001

Date: 2018-08-06 16:56:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for conpany_table
-- ----------------------------
DROP TABLE IF EXISTS `conpany_table`;
CREATE TABLE `conpany_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `company_address` varchar(255) DEFAULT NULL,
  `company_id` varchar(255) DEFAULT NULL,
  `company_name` varchar(255) DEFAULT NULL,
  `company_telephone` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `password_id` varchar(255) DEFAULT NULL,
  `password_tel` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of conpany_table
-- ----------------------------
INSERT INTO `conpany_table` VALUES ('1', '浙江金华', 'SC454327', '金枫谷', '16524064623', '123456', null, null);
