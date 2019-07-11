# 隐式内连接
SELECT emp.ename, emp.joindate, dept.dname
FROM emp,
     dept
WHERE emp.dept_id = dept.id;

# 显式内连接
SELECT emp.ename, emp.joindate, dept.dname
FROM emp
         INNER JOIN dept ON emp.dept_id = dept.id;

# 子查询

SELECT *
FROM emp
WHERE salary =
      (SELECT MAX(salary)
       FROM emp);

SELECT *
FROM emp
WHERE salary < (SELECT AVG(salary) FROM emp);

SELECT *
FROM emp
WHERE dept_id
          IN (SELECT id
              FROM dept
              WHERE dname = '教研部'
                 or dname = '销售部');

SELECT *
FROM emp;

SELECT d1.ename, dept.dname
FROM (SELECT *FROM emp WHERE joindate > '2001-11-11') AS d1,
     dept
WHERE d1.dept_id = dept.id;

