//package com.zjwmybatis.mybatisplus.mysql.config;
//
//import com.mchange.v2.c3p0.ComboPooledDataSource;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import javax.sql.DataSource;
//
///**
// * @author 强周亮
// * @desc 数据源配置类
// * @email 2538096489@qq.com
// * @time 2019-07-09 19:47
// * @class DataSourceConfig
// * @package com.gsww.hzz
// */
//@Configuration
//@PropertySource("classpath:application.properties")
//public class DataSourceConfig {
//
//    private Logger logger = LoggerFactory.getLogger(DataSourceConfig.class);
//
//
//    /**
//     * @Description: 创建第一个数据库连接池
//     * @Parameters: DataSourceConfig
//     */
//    @Bean(name = "defaultDataSource")
//    @Primary
//    @Qualifier("defaultDataSource")
//    @ConfigurationProperties(prefix="spring.datasource.c3p0.default" )
//    public DataSource detaultDataSource() {
//        logger.info("第一个数据库连接池创建中.......");
//        return DataSourceBuilder.create().type(ComboPooledDataSource.class).build();
//    }
//
//    /**
//     * @Description: 创建第二个数据库连接池
//     * @Parameters: DataSourceConfig
//     */
//    @Bean(name = "secondaryDataSource")
//    @Qualifier("secondaryDataSource")
//    @ConfigurationProperties(prefix="spring.datasource.c3p0.secondary")
//    public DataSource secondaryDataSource() {
//        logger.info("第二个数据库连接池创建中......");
//        return DataSourceBuilder.create().type(ComboPooledDataSource.class).build();
//    }
//
//    //配置jdbc
//    @Bean(name = "defaultJdbcTemplate")
//    public JdbcTemplate defaultJdbcTemplate(
//            @Qualifier("defaultDataSource") DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }
//    @Bean(name = "secondaryJdbcTemplate")
//    public JdbcTemplate secondaryJdbcTemplate(
//            @Qualifier("secondaryDataSource") DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }
//}
//
