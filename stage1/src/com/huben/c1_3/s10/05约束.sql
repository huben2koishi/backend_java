# 添加约束
create table class(
    name varchar(20) primary key
);
CREATE TABLE stu
(
    id    INT PRIMARY KEY AUTO_INCREMENT,
    name  VARCHAR(20) NOT NULL UNIQUE,
    class varchar(20),
    constraint fk foreign key (class) references class(name)
);

# 删除非空约束
ALTER TABLE stu
    MODIFY name VARCHAR(20);

# 删除唯一约束
ALTER TABLE stu
    DROP INDEX name;

# 删除主键约束
ALTER TABLE stu
    DROP PRIMARY KEY;


INSERT INTO stu
VALUES (1, '张三');
INSERT INTO stu
VALUES (NULL, '李四');

