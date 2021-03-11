## springboot + mybatisPlus 多数据源配置实例

### 1、思路

- yml中配置多个数据源
- 通过AOP切面控制，动态切换不同数据源
- 配合Druid和mybatisPlus使用

### 2、关键代码
注意单一数据源和多数据源在支持mybatisplus的时候3.0.2和3.2.2存在版本的问题在pom文件有体现
