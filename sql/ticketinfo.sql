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
-- Table structure for ticketinfo
-- ----------------------------
DROP TABLE IF EXISTS `ticketinfo`;
CREATE TABLE `ticketinfo`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `orderinfoid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ticketinfo
-- ----------------------------
INSERT INTO `ticketinfo` VALUES ('1', '001', '待支付');
INSERT INTO `ticketinfo` VALUES ('2', '002', '已支付');
INSERT INTO `ticketinfo` VALUES ('3', '003', '已完成');
INSERT INTO `ticketinfo` VALUES ('4', '004', '退款中');

SET FOREIGN_KEY_CHECKS = 1;

