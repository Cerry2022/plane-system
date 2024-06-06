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

 Date: 18/11/2019 21:59:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for orderinfo
-- ----------------------------
DROP TABLE IF EXISTS `orderinfo`;
CREATE TABLE `orderinfo`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `orderno` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单号',
  `useinfoid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户信息表id（外键）',
  `flightinfoid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '航班信息表id（外键）',
  `passengername1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '乘客1姓名',
  `passengeridnumber1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '乘客1身份证号',
  `passengerphone1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '乘客1电话',
  `passengernumbr1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '乘客1座位号',
  `passengerprice1` float NOT NULL COMMENT '乘客1票价',
  `passengername2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '乘客2姓名',
  `passengeridnumber2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '乘客2身份证号',
  `passengerphone2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '乘客2电话',
  `passengernumbr2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '乘客2座位号',
  `passengerprice2` float DEFAULT NULL COMMENT '乘客2票价',
  `passengername3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '乘客3姓名',
  `passengeridnumber3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '乘客3身份证号',
  `passengerphone3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '乘客3电话',
  `passengernumbr3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '乘客3座位号',
  `passengerprice3` float DEFAULT NULL COMMENT '乘客3票价',
  `ordertime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单时间',
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单状态（下达订单，支付订单，出票结束，退票，返还支付结束）',
  PRIMARY KEY (`id`) USING BTREE,
  CONSTRAINT `fk_flightinfo` FOREIGN KEY (`flightinfoid`) REFERENCES `flightinfo` (`id`),
  CONSTRAINT `fk_useinfo` FOREIGN KEY (`useinfoid`) REFERENCES `useinfo` (`id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;
-- ----------------------------
-- Records of orderinfo
-- ----------------------------
INSERT INTO `orderinfo` (`id`, `orderno`, `useinfoid`, `flightinfoid`, `passengername1`, `passengeridnumber1`, `passengerphone1`, `passengernumbr1`, `passengerprice1`, `passengername2`, `passengeridnumber2`, `passengerphone2`, `passengernumbr2`, `passengerprice2`, `passengername3`, `passengeridnumber3`, `passengerphone3`, `passengernumbr3`, `passengerprice3`, `ordertime`, `status`) VALUES
('1', 'ORD123456', '1', '1', '张三', '123456789012345678', '12345678901', 'A1', 1000.00, '李四', '234567890123456789', '23456789012', 'B2', 800.00, '王五', '345678901234567890', '34567890123', 'C3', 900.00, '2024-05-26 10:30:00', '支付订单'),
('2', 'ORD123457', '2', '3', '赵六', '456789012345678901', '45678901234', 'D4', 800.00, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2024-05-26 11:45:00', '下达订单'),
('3', 'ORD123458', '3', '5', '小明', '567890123456789012', '56789012345', 'E5', 1100.00, '小红', '678901234567890123', '67890123456', 'F6', 850.00, NULL, NULL, NULL, NULL, NULL, '2024-05-26 12:00:00', '出票结束'),
('4', 'ORD123459', '4', '7', '小李', '789012345678901234', '78901234567', 'G7', 700.00, '小丽', '890123456789012345', '89012345678', 'H8', 500.00, '小华', '901234567890123456', '90123456789', 'I9', 600.00, '2024-05-26 14:20:00', '退票'),
('5', 'ORD123460', '5', '9', '小明', '567890123456789012', '56789012345', 'J10', 1200.00, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2024-05-26 15:30:00', '返还支付结束');


SET FOREIGN_KEY_CHECKS = 1;
