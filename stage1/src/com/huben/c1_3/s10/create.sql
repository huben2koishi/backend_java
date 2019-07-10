CREATE TABLE student
(
    id      INT,
    name    VARCHAR(20),
    age     INT,
    sex     VARCHAR(5),
    address VARCHAR(100),
    math    INT,
    english INT
);

INSERT INTO student(id, name, age, sex, address, math, english)
values (1, '马云', 55, '男', '杭州', 66, 78),
       (2, '马化腾', 45, '男', '深圳', 98, 87),
       (3, '马景涛', 55, '男', '香港', 56, 77),
       (4, '柳岩', 20, '女', '湖南', 76, 65),
       (5, '柳青', 20, '男', '湖南', 86, NULL),
       (6, '刘德华', 57, '男', '香港', 99, 99),
       (7, '马德', 22, '女', '香港', 99, 99),
       (8, '德玛西亚', 18, '男', '南京', 56, 65);
