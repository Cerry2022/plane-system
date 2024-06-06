SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `role` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色（普通用户、管理员）',
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '性别',
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电话',
  `idnumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '身份证号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
-- ----------------------------
-- Records of useinfo
-- ----------------------------
INSERT INTO `userinfo` (`id`, `name`, `password`, `role`, `sex`, `phone`, `idnumber`) VALUES
('1', 'admin', 'admin123', '管理员', '男', '13812345678', '310101199001010001'),
('2', '李文', '123456', '普通用户', '女', '15823456789', '310102199002020002'),
('3', '王宇航', 'password', '普通用户', '男', '13934567890', '310103199003030003'),
('4', '赵丽', 'abcdef', '普通用户', '女', '13645678901', '310104199004040004'),
('5', '孙华', '123456789', '普通用户', '男', '13456789012', '310105199005050005'),
('6', '刘佳', '1234567890', '普通用户', '女', '15267890123', '310106199006060006'),
('7', '陈雨萌', 'adminadmin', '普通用户', '女', '13178901234', '310107199007070007'),
('8', '周磊', 'qwerty', '普通用户', '男', '13589012345', '310108199008080008'),
('9', '吴婷婷', 'password123', '普通用户', '女', '15890123456', '310109199009090009'),
('10', '郑伟', 'abcdef123', '普通用户', '男', '13001234567', '310110199010100010'),
('11', '朱红', '12345678', '普通用户', '女', '13912345678', '310111199011110011'),
('12', '刘建华', 'password1234', '普通用户', '男', '13823456789', '310112199012120012'),
('13', '张敏', 'qwertyui', '普通用户', '女', '13734567890', '310113199013130013'),
('14', '李俊杰', 'admin123456', '普通用户', '男', '13745678901', '310114199014140014'),
('15', '王丹', '1234567890', '普通用户', '女', '13656789012', '310115199015150015');

SET FOREIGN_KEY_CHECKS = 1
