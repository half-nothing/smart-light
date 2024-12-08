CREATE TABLE IF NOT EXISTS `smart-light`.`users`
(
    `id`       int         NOT NULL AUTO_INCREMENT,
    `username` varchar(64) NOT NULL,
    `password` char(64)    NOT NULL,
    `salt`     char(32)    NOT NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `users` (`username`, `password`, `salt`)
VALUES ('Half_nothing', 'e810c36b167a1edfebad63b5157457540cf834afbd522099b3975883fd1f5ef4',
        '4LwnxzGGAzZtJH1zA4Fxc27wZ8xQjWop');
