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