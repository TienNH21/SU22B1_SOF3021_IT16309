package su22b1.sof3021.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import su22b1.sof3021.demo_config_bean.UserDaoInterface;
import su22b1.sof3021.demo_config_bean.UserDaoMySql;
import su22b1.sof3021.demo_config_bean.UserDaoSqlServer;

@Configuration
public class DemoBeanConfig {
	@Bean("user_dao_mysql")
	public UserDaoInterface getUserDaoMySQL()
	{
		return new UserDaoMySql();
	}
	
	@Bean("user_dao_sqlserver")
	public UserDaoInterface getUserDaoSqlServer()
	{
		return new UserDaoSqlServer();
	}
}
