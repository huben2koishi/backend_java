# 查看所有数据库名称
SHOW DATABASES;

# 查看创建该数据库的语句
SHOW CREATE DATABASE mysql;

# 创建数据库
CREATE DATABASE learn;
# 创建前判断是否存在
CREATE DATABASE IF NOT EXISTS learn;
# 指定字符集
CREATE DATABASE learn2 CHARACTER SET gbk;

# 修改
ALTER DATABASE learn2 character set  utf8;

# 删除
DROP DATABASE learn2;
# 删除前判断是否存在
DROP DATABASE IF EXISTS learn2;

# 使用数据库
USE learn;
# 查看正在使用的数据库
SELECT DATABASE();