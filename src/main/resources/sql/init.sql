CREATE TABLE `user`(
                       `id` BIGINT(10) NOT NULL AUTO_INCREMENT COMMENT 'ID',
                       `first_name` VARCHAR(32) NULL COMMENT 'first name',
                       `last_name` VARCHAR(32) NULL COMMENT  'last name',
                       `creat_time` DATE NOT NULL COMMENT 'creat time',
                       `update_time` DATE COMMENT 'update_time',
                       `is_active` BOOLEAN NOT NULL  COMMENT 'true for active, false for inactive',
                       `user_name` VARCHAR(64) NOT NULL  COMMENT 'name for log in',
                       `e_mail` VARCHAR(64) NULL COMMENT 'e-mail',
                       `password_hashed` VARCHAR(128)  NOT NULL COMMENT 'hashed password',
                       `location` VARCHAR(256) NULL COMMENT 'location',
                       `level` INTEGER NOT NULL  COMMENT 'account level',
                       `forbid_until` DATE NULL COMMENT 'if account is inactive, when its lift ban',
                       PRIMARY KEY (`id`)
)ENGINE = InnoDB CHARACTER SET =utf8;

DROP TABLE `article`;
CREATE TABLE `article`(
                          `id` int(10) ZEROFILL NOT NULL AUTO_INCREMENT COMMENT 'ID',
                          `keyword` varchar(128) NULL COMMENT '关键词',
                          `likes` varchar(10) NULL,
                          `state` int(2) NULL COMMENT '文章发布状态 => 0 草稿，1 已发布,\'\' 代表所有文章',
                          `category_id` int(10) NULL,
                          `create_time` datetime(0) NOT NULL,
                          `update_time` datetime(0) NULL,
                          `author` varchar(128) NULL,
                          `is_active` int(255) NULL,
                          `article_details_id` bigint(10) not null ,
                          PRIMARY KEY (`id`)
)ENGINE = InnoDB CHARACTER SET =utf8;

DROP TABLE `article_details`;
CREATE TABLE `article_details`  (
                                   `id` bigint(10) NOT NULL,
                                   `topic` varchar(255) NULL,
                                   `author` varchar(128) NULL,
                                   `category` json NULL,
                                   `comments` mediumtext NULL,
                                   `create_time` datetime(0) NOT NULL,
                                   `description` varchar(255) NULL,
                                   `content` mediumtext NULL,
                                   `img_url` varchar(511) NULL,
                                   `numbers` int(0) NULL,
                                   `keyword` json NULL,
                                   `like_users` json NULL,
                                   `meta` json NULL,
                                   `origin` bigint(10) NULL,
                                   `state` int(0) NULL,
                                   `tags` json NULL,
                                   `title` varchar(255) NULL,
                                   `update_time` datetime(0) NULL,
                                   PRIMARY KEY (`id`)
)ENGINE = InnoDB CHARACTER SET =utf8;