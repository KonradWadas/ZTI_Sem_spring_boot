package hello;



import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
public class Config{

    @Bean(name = "hibernateConfig")
    public org.hibernate.cfg.Configuration getConfig() {
    	org.hibernate.cfg.Configuration config = new org.hibernate.cfg.Configuration();
    	config.setProperty("hibernate.temp.use_jdbc_metadata_defaults","false");
    	return config;
    }
   @Bean
   public DataSource dataSource(){
      DriverManagerDataSource dataSource = new DriverManagerDataSource();
      dataSource.setDriverClassName("org.postgresql.Driver");
      dataSource.setUrl("URL");
      dataSource.setUsername( "USER" );
      dataSource.setPassword( "PASS" );
      return dataSource;
   }
}