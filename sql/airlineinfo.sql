/*
 Navicat Premium Data Transfer

 Source Server         : Mydatabase
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : java_data

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 18/11/2019 21:59:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for airlineinfo
-- ----------------------------
DROP TABLE IF EXISTS `airlineinfo`;
CREATE TABLE `airlineinfo`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL  COMMENT '主键',
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '航空公司编码',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '航空公司名称',

  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of airlineinfo
-- ----------------------------
INSERT INTO `airlineinfo` VALUES ('1', 'CA', '中国国际航空公司');
INSERT INTO `airlineinfo` VALUES ('2', 'MU', '中国东方航空公司');
INSERT INTO `airlineinfo` VALUES('3', 'CZ', '中国南方航空公司');
INSERT INTO `airlineinfo` VALUES('4', 'HU', '海南航空公司');
 INSERT INTO `airlineinfo` VALUES('5', 'MF', '厦门航空公司');
 

SET FOREIGN_KEY_CHECKS = 1;
