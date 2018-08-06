/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50539
Source Host           : localhost:3306
Source Database       : seed

Target Server Type    : MYSQL
Target Server Version : 50539
File Encoding         : 65001

Date: 2018-08-06 16:57:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for land_table
-- ----------------------------
DROP TABLE IF EXISTS `land_table`;
CREATE TABLE `land_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `farmer_id` varchar(255) DEFAULT NULL,
  `land_address` varchar(255) DEFAULT NULL,
  `land_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of land_table
-- ----------------------------
INSERT INTO `land_table` VALUES ('26', 'SF189732', '浙江金华', '1');
INSERT INTO `land_table` VALUES ('27', 'SF189732', '浙江金华', '2');
INSERT INTO `land_table` VALUES ('28', 'SF189732', '浙江金华', '3');
INSERT INTO `land_table` VALUES ('29', 'SF189732', '浙江金华', '4');
INSERT INTO `land_table` VALUES ('30', 'SF189732', '浙江金华', '5');
INSERT INTO `land_table` VALUES ('31', 'SF657144', '北京郊区', '1');
INSERT INTO `land_table` VALUES ('32', 'SF657144', '北京郊区', '2');
INSERT INTO `land_table` VALUES ('33', 'SF657144', '北京郊区', '3');
