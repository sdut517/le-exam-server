/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : le_exam

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 12/01/2021 23:55:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for answer
-- ----------------------------
DROP TABLE IF EXISTS `answer`;
CREATE TABLE `answer`  (
  `aid` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `eeid` int(11) NOT NULL COMMENT '考生编号',
  `qid` int(11) NOT NULL COMMENT '题目编号',
  `ans` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '答案',
  `time` datetime(0) NOT NULL COMMENT '时间',
  PRIMARY KEY (`aid`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '答题表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of answer
-- ----------------------------

-- ----------------------------
-- Table structure for exam
-- ----------------------------
DROP TABLE IF EXISTS `exam`;
CREATE TABLE `exam`  (
  `eid` int(11) NOT NULL AUTO_INCREMENT COMMENT '考试编号',
  `ename` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '考试名称',
  `start_time` datetime(0) NOT NULL COMMENT '开始时间',
  `end_time` datetime(0) NOT NULL COMMENT '结束时间',
  `login_in_advance` int(11) NOT NULL DEFAULT 0 COMMENT '提前登录',
  `restricted_login` int(11) NOT NULL DEFAULT 0 COMMENT '限制登录',
  `welcome_msg` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '欢迎语',
  `test_paper` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '试卷json',
  `personal_info` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '个人信息json',
  `e_sign_up` int(11) NOT NULL DEFAULT 0 COMMENT '即报即考',
  `e_practice_mode` int(11) NOT NULL DEFAULT 0 COMMENT '练习模式',
  `e_ommitment` int(11) NOT NULL DEFAULT 0 COMMENT '考试承诺书',
  `e_ommitment_body` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '考试承诺书内容',
  `e_locked_exam` int(11) NOT NULL DEFAULT 0 COMMENT '锁定考试',
  `e_view_results` int(11) NOT NULL DEFAULT 0 COMMENT '查看成绩',
  `url` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '考试地址',
  PRIMARY KEY (`eid`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '考试表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of exam
-- ----------------------------
INSERT INTO `exam` VALUES (1, '考试名称', '2021-01-06 08:00:00', '2021-01-16 08:00:00', 1, 1, '欢迎语', '[1,2]', '[1,2,3]', 1, 0, 1, '考试承诺书内容', 1, 12, '考试地址');
INSERT INTO `exam` VALUES (2, '名称', '2021-01-06 13:12:11', '2021-01-16 09:14:21', 1, 1, '欢迎语', '[1,2]', '[1,2,3]', 1, 0, 1, '考试承诺书内容', 1, 12, '考试地址');

-- ----------------------------
-- Table structure for examinee
-- ----------------------------
DROP TABLE IF EXISTS `examinee`;
CREATE TABLE `examinee`  (
  `eeid` int(11) NOT NULL AUTO_INCREMENT COMMENT '考生编号',
  `status` int(11) NOT NULL DEFAULT 0 COMMENT '考生状态',
  `number` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '准考证号',
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '姓名',
  `eid` int(11) NOT NULL COMMENT '考试编号',
  `email` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '邮箱',
  `phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '手机号',
  `gender` int(11) NOT NULL COMMENT '性别',
  `id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '身份证号',
  `login_time` datetime(0) NULL DEFAULT NULL COMMENT '登陆时间',
  `is_email` int(11) NOT NULL DEFAULT 0 COMMENT '邮件通知',
  `grade` double NULL DEFAULT NULL COMMENT '成绩',
  `is_score` int(11) NOT NULL DEFAULT 0 COMMENT '是否判分',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `finish_time` datetime(0) NULL DEFAULT NULL COMMENT '完成时间',
  `cost_time` int(11) NULL DEFAULT NULL COMMENT '考试用时秒数',
  `pwd` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`eeid`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '考生表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of examinee
-- ----------------------------
INSERT INTO `examinee` VALUES (1, 1, 'BfjLf34524', '李威', 1, 'chall21@yeah.net', '17753062762', 1, '370', '2021-01-06 09:40:57', 0, 22, 0, '2021-01-06 09:25:55', '2021-01-14 09:25:50', 3630, '1111');
INSERT INTO `examinee` VALUES (2, 1, 'KNptM34529', '赵丽红', 2, '2923889186@qq.com', '17662435705', 0, '370', '2021-01-06 11:10:45', 0, 23, 1, '2021-01-06 11:11:08', '2021-01-06 11:11:11', 1234, '123');
INSERT INTO `examinee` VALUES (3, 0, '4561dsf', '江斌', 1, '777@qq.com', '15550310405', 1, '37', '2021-01-11 16:10:09', 0, 11, 0, '2021-01-11 16:10:16', '2021-01-11 16:10:18', 1111, '111');
INSERT INTO `examinee` VALUES (4, 0, 'sdrt4', '姜富超', 2, 'a@qq.com', '155555555', 0, '33', '2021-01-11 16:25:30', 0, 33, 0, '2021-01-11 16:25:37', '2021-01-11 16:25:38', 11, '22');

-- ----------------------------
-- Table structure for log
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log`  (
  `lid` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `type` int(11) NOT NULL COMMENT '日志类型',
  `lname` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '日志名称',
  `lbody` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '日志内容',
  `ltime` datetime(0) NOT NULL COMMENT '发生时间',
  PRIMARY KEY (`lid`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '日志表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of log
-- ----------------------------

-- ----------------------------
-- Table structure for org
-- ----------------------------
DROP TABLE IF EXISTS `org`;
CREATE TABLE `org`  (
  `oid` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `oname` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '机构名称',
  `type` int(11) NOT NULL DEFAULT 0 COMMENT '机构类型',
  `url` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '网站URL',
  `logo` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '机构logo',
  `eids` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'exam表主键json',
  PRIMARY KEY (`oid`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '机构表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of org
-- ----------------------------
INSERT INTO `org` VALUES (1, '机构名', 0, 'url', 'logo', '[1,2]');

-- ----------------------------
-- Table structure for power
-- ----------------------------
DROP TABLE IF EXISTS `power`;
CREATE TABLE `power`  (
  `pid` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `pname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '身份',
  `power` int(11) NOT NULL COMMENT '权限内容',
  PRIMARY KEY (`pid`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '权限表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of power
-- ----------------------------

-- ----------------------------
-- Table structure for ques_bank
-- ----------------------------
DROP TABLE IF EXISTS `ques_bank`;
CREATE TABLE `ques_bank`  (
  `qbid` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `qbname` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '题库名称',
  `question` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL COMMENT '题目json',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL COMMENT '更新时间',
  `oid` int(11) NOT NULL COMMENT '组织编号',
  PRIMARY KEY (`qbid`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '题库表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ques_bank
-- ----------------------------

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question`  (
  `qid` int(11) NOT NULL AUTO_INCREMENT COMMENT '题目编号',
  `qtype` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '题目类型',
  `qnumber` int(11) NOT NULL COMMENT '题号',
  `qstem` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '题干',
  `qans` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '答案json',
  `analysis` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '题目分析',
  `points` int(11) NOT NULL DEFAULT 1 COMMENT '题目分值',
  `out_of_order` int(11) NOT NULL DEFAULT 0 COMMENT '填空题答案乱序',
  `options` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '选项json',
  `difficult` int(11) NULL DEFAULT NULL COMMENT '难度',
  `tag` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL COMMENT '标签',
  PRIMARY KEY (`qid`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '题目表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of question
-- ----------------------------
INSERT INTO `question` VALUES (1, '题目类型', 1, '题干', '答案', '题目分析', 12, 0, '选项', NULL, NULL);
INSERT INTO `question` VALUES (2, '类型', 1, '题干', '[1,2]', '题目分析', 100, 1, '[2,1]', 2, '标签');

-- ----------------------------
-- Table structure for signup
-- ----------------------------
DROP TABLE IF EXISTS `signup`;
CREATE TABLE `signup`  (
  `sid` int(11) NOT NULL AUTO_INCREMENT COMMENT '报名编号',
  `sname` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '报名名称',
  `banner` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '报名海报',
  `sdesc` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '报名描述',
  `is_verify` int(11) NOT NULL DEFAULT 0 COMMENT '是否需要验证',
  `collect_info` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '收集信息json',
  `start_time` datetime(0) NOT NULL COMMENT '开始时间',
  `end_time` datetime(0) NOT NULL COMMENT '结束时间',
  `oid` int(11) NOT NULL COMMENT '机构编号',
  `url` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '地址',
  `status` int(11) NOT NULL DEFAULT 0 COMMENT '状态',
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of signup
-- ----------------------------
INSERT INTO `signup` VALUES (1, 'name', 'banner', 'desxc', 0, '[1,2]', '2021-01-11 14:54:22', '2021-01-11 14:54:23', 1, 'url', 0);
INSERT INTO `signup` VALUES (2, 'name2', 'ban2', 'des2', 1, '[2,1]', '2021-01-11 15:07:16', '2021-01-11 15:07:18', 0, 'url2', 1);

-- ----------------------------
-- Table structure for signup_do
-- ----------------------------
DROP TABLE IF EXISTS `signup_do`;
CREATE TABLE `signup_do`  (
  `sdid` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `eeid` int(11) NOT NULL COMMENT '考生编号',
  `sid` int(11) NOT NULL COMMENT '报名编号',
  `time` datetime(0) NOT NULL COMMENT '报名时间',
  PRIMARY KEY (`sdid`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '考生报名表' ROW_FORMAT = Fixed;

-- ----------------------------
-- Records of signup_do
-- ----------------------------
INSERT INTO `signup_do` VALUES (1, 2, 1, '2021-01-11 14:54:39');
INSERT INTO `signup_do` VALUES (2, 1, 1, '2021-01-11 15:07:49');
INSERT INTO `signup_do` VALUES (3, 2, 2, '2021-01-11 15:08:01');
INSERT INTO `signup_do` VALUES (4, 1, 2, '2021-01-09 15:08:07');
INSERT INTO `signup_do` VALUES (5, 3, 1, '2021-01-11 16:18:58');
INSERT INTO `signup_do` VALUES (6, 3, 2, '2021-01-03 16:19:12');
INSERT INTO `signup_do` VALUES (7, 4, 1, '2021-01-11 16:26:57');
INSERT INTO `signup_do` VALUES (8, 4, 2, '2021-01-11 16:27:05');

-- ----------------------------
-- Table structure for test_paper
-- ----------------------------
DROP TABLE IF EXISTS `test_paper`;
CREATE TABLE `test_paper`  (
  `tpid` int(11) NOT NULL AUTO_INCREMENT COMMENT '试卷编号',
  `tpname` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '试卷名称',
  `tpdesc` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '试卷描述',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL COMMENT '更新时间',
  `at_least_time` int(11) NOT NULL DEFAULT 0 COMMENT '至少时间',
  `limit_time` int(11) NOT NULL DEFAULT 0 COMMENT '限时时间',
  `full_marks` int(11) NOT NULL DEFAULT 0 COMMENT '满分分数',
  `notes_title` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '考生须知（标题）',
  `notes_body` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '考试须知（内容）',
  `unit` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL COMMENT '单元（json）',
  `oid` int(11) NULL DEFAULT NULL COMMENT '组织id',
  PRIMARY KEY (`tpid`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '试卷表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of test_paper
-- ----------------------------
INSERT INTO `test_paper` VALUES (1, '新建试卷', '试卷描述', '2021-01-06 14:59:43', '2021-01-06 14:59:46', 12, 21, 100, '考生须知', '考试须知', '[1,2,3]', 1);
INSERT INTO `test_paper` VALUES (2, '新试卷', '描述', '2021-01-09 14:59:15', '2021-01-09 14:59:18', 44, 344, 300, '须知', 'body', '[1,2]', 1);

-- ----------------------------
-- Table structure for unit
-- ----------------------------
DROP TABLE IF EXISTS `unit`;
CREATE TABLE `unit`  (
  `uid` int(11) NOT NULL AUTO_INCREMENT COMMENT '单元编号',
  `uname` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '单元名',
  `desc_title` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '单元说明标题',
  `desc_body` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '单元说明内容',
  `is_out_of_order1` int(11) NOT NULL DEFAULT 0 COMMENT '是否题目乱序',
  `is_out_of_order2` int(11) NOT NULL DEFAULT 0 COMMENT '是否选项乱序',
  `is_ban_turn_over` int(11) NOT NULL DEFAULT 0 COMMENT '是否禁止翻题',
  `at_least_time` int(11) NOT NULL DEFAULT 0 COMMENT '至少时间',
  `limit_time` int(11) NOT NULL DEFAULT 0 COMMENT '限时时间',
  `full_marks` int(11) NOT NULL DEFAULT 0 COMMENT '总分',
  `questions` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL COMMENT '大题json',
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '单元表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of unit
-- ----------------------------
INSERT INTO `unit` VALUES (1, '单元名', '单元标题', '单元描述', 0, 0, 0, 22, 33, 100, '[1,2]');
INSERT INTO `unit` VALUES (2, '单元name', '标题title', '单元des描述', 0, 1, 0, 45, 32, 20, '[1]');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `uid` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `uname` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户名',
  `oid` int(11) NOT NULL COMMENT '机构编号',
  `email` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '邮箱',
  `phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '姓名',
  `pid` int(11) NOT NULL COMMENT '权限编号',
  `pwd` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '密码',
  `status` int(11) NOT NULL DEFAULT 0 COMMENT '激活状态',
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '1', 2, '3', '4', '5', 6, '7', 0);

SET FOREIGN_KEY_CHECKS = 1;
