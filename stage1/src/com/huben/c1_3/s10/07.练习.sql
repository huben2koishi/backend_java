SELECT emp.id, emp.ename, emp.salary, job.jname, JOB.description
FROM emp
         JOIN job ON emp.job_id = job.id;

SELECT emp.id, emp.ename, emp.salary, j.jname, j.description, d.dname, d.loc
FROM emp
         JOIN job j on emp.job_id = j.id
         JOIN dept d on emp.dept_id = d.id;

SELECT emp.ename, emp.salary, salarygrade.grade
FROM emp,
     salarygrade
WHERE emp.salary BETWEEN salarygrade.losalary AND salarygrade.hisalary;

SELECT emp.ename, emp.salary, job.jname, job.description, dept.dname, dept.loc, salarygrade.grade
FROM emp,
     job,
     dept,
     salarygrade
WHERE emp.job_id = job.id
  AND emp.dept_id = dept.id
  AND emp.salary BETWEEN salarygrade.losalary AND salarygrade.hisalary;

SELECT dept.id, dept.dname, dept.loc, d.num
FROM (SELECT dept_id, COUNT(dept_id) AS num
      FROM emp
      GROUP BY dept_id) as d,
     dept
WHERE d.dept_id = dept.id;

SELECT d1.ename, d2.ename
FROM emp AS d1
         LEFT JOIN emp AS d2 ON d1.mgr = d2.id;