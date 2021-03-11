//package com.zjwmybatis.mybatisplus.mysql.config;
///** Created by hspcadmin on 2021/2/4. */
//import com.baomidou.mybatisplus.core.injector.ISqlInjector;
//import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
//import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
//import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
//import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
///**
// * @author hspcadmin
// * @create 2021-02-04 10:31
// */
//@EnableTransactionManagement
//@Configuration
////@MapperScan("com.zjwmybatis.mybatisplus.**.mapper.db*")
//public class MybatisPlusConfig {
//
//    // 注册乐观锁组件
//    @Bean
//    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
//        return new OptimisticLockerInterceptor();
//    }
//
//    // 分页插件
//    @Bean
//    public PaginationInterceptor paginationInterceptor() {
//        return new PaginationInterceptor();
//    }
//
//
//    // 逻辑删除组件
//    @Bean
//    public ISqlInjector sqlInjector() {
//        return new LogicSqlInjector();
//    }
//
//    // sql执行效率插件
//    @Bean
//    @Profile({"dev", "test"}) // 设置dev，test环境开启，保证我们的效率
//    public PerformanceInterceptor performanceInterceptor() {
//        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
//        performanceInterceptor.setMaxTime(1000000); // ms  设置sql的最大执行时间，超过设置时间则不执行
//        performanceInterceptor.setFormat(true); // 格式化sql开启
//
//        return performanceInterceptor;
//    }
//
//
//
//}
