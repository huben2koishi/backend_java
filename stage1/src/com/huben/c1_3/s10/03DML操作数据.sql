# 添加数据
INSERT INTO stu(id, name, age, score, birthday)
values (1, "小明", 18, 514, "1998-5-14");

INSERT INTO stu
VALUES (2, "小红", 17, 223, "1998-2-23", NULL);

INSERT INTO stu(id, name, age, score, birthday)
values (3, "小刚", 16, 524, "1994-7-12");

# 删除数据
DELETE
FROM stu
WHERE age = 17;
# 删除全部数据
TRUNCATE TABLE stu;
-- 删除表, 再创建一个同名的新表


# 修改数据
UPDATE stu
SET score=345
WHERE id = 2;



select *
from stu;

desc stu;