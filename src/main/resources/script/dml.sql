SELECT a.`code`, a.`level`,(a.check_num - a.unqualified_num) / a.check_num 
    FROM check_item_result_statis a 
    WHERE a.report_id = 4;

CREATE TABLE `check_item_report_result` (
    `report_id` int(11) NOT NULL DEFAULT '0',
    `score` double(4,2) DEFAULT NULL,
    `report_level` varchar(64) DEFAULT NULL,
    PRIMARY KEY (`report_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `check_item_result_statis` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `report_num` char(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `item_code` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `item_name` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `check_level` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `check_num` int(11) DEFAULT NULL,
  `unqualified_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=518 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=COMPACT;

CREATE TABLE `check_report_info` (
  `report_num` char(64) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `project_name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `project_address` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `agent_name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `qa_name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `qa_address` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `contact_tel` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `contact_fax` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `contact_post_code` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `message` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `report_conclusion` text COLLATE utf8mb4_unicode_ci,
  PRIMARY KEY (`report_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=COMPACT;

CREATE TABLE `report_duty_info_map` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Report_num` char(20) DEFAULT NULL,
  `duty_person` varchar(255) DEFAULT NULL COMMENT '用户ID',
  `duty_tel` varchar(255) DEFAULT NULL,
  `verify_token` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;