/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50539
Source Host           : localhost:3306
Source Database       : seed

Target Server Type    : MYSQL
Target Server Version : 50539
File Encoding         : 65001

Date: 2018-08-06 16:57:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for seed_table
-- ----------------------------
DROP TABLE IF EXISTS `seed_table`;
CREATE TABLE `seed_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `seed_code` varchar(255) DEFAULT NULL,
  `seed_traceability` varchar(255) DEFAULT NULL,
  `farmer_id` varchar(255) DEFAULT NULL,
  `seed_name` varchar(255) DEFAULT NULL,
  `storage_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of seed_table
-- ----------------------------
INSERT INTO `seed_table` VALUES ('1', 'sdfa5465as', null, 'SF189732', '四季豆', '2018-07-27 09:24:01');
INSERT INTO `seed_table` VALUES ('2', 'gd8fg8e5r6', null, 'SF189732', '豇豆', '2018-07-27 09:24:28');
INSERT INTO `seed_table` VALUES ('3', 'wrw4d68f7ga', null, 'SF189732', '西红柿', '2018-07-27 09:24:47');
INSERT INTO `seed_table` VALUES ('4', 'bc9852', null, 'SF657144', '大白菜', '2018-07-31 09:28:40');
INSERT INTO `seed_table` VALUES ('5', 'hlb4256', null, 'SF657144', '胡萝卜', '2018-07-31 09:28:58');
