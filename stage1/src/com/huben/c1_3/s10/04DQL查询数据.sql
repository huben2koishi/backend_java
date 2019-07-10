# 查询所有数据
SELECT *
FROM stu;

SELECT address
from student;
SELECT DISTINCT address
from student;

# IFNULL(a, b) 若 a 为 null 则取 b
SELECT name, math, english, math + IFNULL(english, 0)
FROM student;

# AS 别名
SELECT name, math, english, math + IFNULL(english, 0) AS total
FROM student;

# 查询
SELECT *
FROM student
WHERE age > 20
  AND age < 30;
# BETWEEN... AND...
SELECT *
FROM student
WHERE age BETWEEN 20 AND 30;
# IN ()
SELECT *
FROM student
WHERE age IN (20, 23, 55);
# 判断 NULL
SELECT *
FROM student
WHERE english IS NULL;
# 模糊查询
SELECT *
FROM student
WHERE name LIKE '马%';
SELECT *
FROM student
WHERE name LIKE '%德%';

# 排序
SELECT *
FROM student
ORDER BY math, english DESC;

# 聚合函数
SELECT COUNT(math)
FROM student;
SELECT MAX(math)
FROM student;
SELECT MIN(math)
FROM student;
SELECT SUM(math)
FROM student;
SELECT AVG(math)
FROM student;

# 分组
SELECT sex,AVG(math),COUNT(id)
FROM student
WHERE math>70
GROUP BY sex
HAVING  COUNT(id)>2;

# 分页
SELECT * FROM student LIMIT 0,4;
SELECT * FROM student LIMIT 4,4;
