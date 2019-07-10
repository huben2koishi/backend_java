# 查看所有数据表名称
SHOW TABLES;

# 查看表结构
DESC sutdent;

# 创建数据表
CREATE TABLE sutdent
(
    id         INT,
    name       VARCHAR(32),
    age        INT,
    score      DOUBLE(4, 1),
    birthday   DATE,
    insertTime TIMESTAMP
);

# 修改表名
ALTER TABLE sutdent RENAME TO stu;
# 修改字符集
ALTER TABLE stu
    CHARACTER SET utf8;
# 添加列
ALTER TABLE stu
    ADD gender VARCHAR(10);
# 修改列
ALTER TABLE stu
    CHANGE gender sex VARCHAR(5);
ALTER TABLE stu
    MODIFY sex varchar(10);

# 删除表
DROP TABLE sutdent;
# 删除列
ALTER TABLE stu
    DROP sex;

DESC stu;

