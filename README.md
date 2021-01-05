# 乐考在线考试系统后端

## 下载

从仓库下载最近代码(SSH)：

```shell
$ git clone git@github.com:le-exam/le-exam-server.git
```

或者(HTTPS)：

```shell
$ git clone https://github.com/le-exam/le-exam-server.git
```



## 初次运行

在 src→main→resources 下创建application.yml 文件。

将以下代码放进入，端口号、数据库名、数据库用户名以及密码更换为自己的即可。

```yml
server:
  port: 8080

spring:
  profiles:
    active: dev
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    type: com.alibaba.druid.pool.DruidDataSource
    url: jdbc:mysql://localhost:3306/le_exam?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=UTF-8
    username: root
    password:
```



## 后续工作

创建并切换到自己的分支：

```shell
$ git checkout -b *****
```

切换分支

```shell
$ git checkout *****
```

在***分支提交代码

```shell
$ git add .
$ git commit -m "*******"(版本描述)
$ git push origin ***(你自己的分支)
```

版本描述：新增...，修改....，删除....

原始代码在自己分支上提交，完成功能后将代码合并到开发分支dev，测试完成后将代码合并到主分支master。

```shell
$ git pull
$ git checkout ****(要合并到的分支，比如dev或master)
$ git merge ***(你自己的分支)
```

