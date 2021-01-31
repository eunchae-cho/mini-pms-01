package com.pms.config;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@MapperScan("com.pms.dao")
public class MybatisConfig {

  @Bean
  public SqlSessionFactory sqlSessionFactory(DataSource dataSource, // DB 커넥션풀
      ApplicationContext appCtx // Spring IoC 컨테이너
  ) throws Exception {
    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
    sqlSessionFactoryBean.setDataSource(dataSource);
    sqlSessionFactoryBean.setTypeAliasesPackage("com.pms.domain");
    sqlSessionFactoryBean
        .setMapperLocations(appCtx.getResources("classpath:com/pms/mapper/*Mapper.xml"));
    return sqlSessionFactoryBean.getObject();
  }
}


