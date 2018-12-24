package com.stone.mp.test;

import org.junit.Test;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class TestMP {
	
	//代码生成示例代码
	@Test
	public void testGenerator() {
		//1.全局配置
		GlobalConfig globalConfig = new GlobalConfig();
		globalConfig.setActiveRecord(true) //是否支持AR模式
					.setAuthor("stone") //作者
					.setOutputDir("D:\\code\\mp03\\src\\main\\java") //生成路径
					.setFileOverride(true) //文件覆盖
					.setIdType(IdType.AUTO) //主键策略
					.setServiceName("%sService") //设置生成的Service接口的名字的首字母不为I
					.setBaseResultMap(true)
					.setBaseColumnList(true);
		
		//2.数据源配置
		DataSourceConfig sourceConfig = new DataSourceConfig();
		sourceConfig.setDbType(DbType.MYSQL)
					.setDriverName("com.mysql.jdbc.Driver")
					.setUrl("jdbc:mysql://172.30.60.14:3306/mybatis")
					.setUsername("stest1")
					.setPassword("P@ssw0rd1");
		
		//3.策略配置
		StrategyConfig strategyConfig = new StrategyConfig();
		strategyConfig.setCapitalMode(true) //全局大写命名
					  .setDbColumnUnderline(true) //指定表名字段名是否使用下划线
					  .setNaming(NamingStrategy.underline_to_camel) //数据库表映射到实体的命名策略
					  .setTablePrefix("tbl_")
					  .setInclude("tbl_employee"); //生成的表
		
		//4.包名策略配置
		PackageConfig packageConfig = new PackageConfig();
		packageConfig.setParent("com.stone.mp")
					 .setMapper("mapper")
					 .setService("service")
					 .setController("controller")
					 .setEntity("beans")
					 .setXml("mapper");
		
		//5.整合配置
		AutoGenerator autoGenerator = new AutoGenerator();
		autoGenerator.setGlobalConfig(globalConfig)
					 .setDataSource(sourceConfig)
					 .setStrategy(strategyConfig)
					 .setPackageInfo(packageConfig);
		
		//6.执行
		autoGenerator.execute();					 
	}

}
