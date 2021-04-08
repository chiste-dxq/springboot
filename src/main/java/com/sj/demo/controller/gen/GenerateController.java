package com.sj.demo.controller.gen;

import com.github.pagehelper.PageHelper;
import com.sj.demo.common.annotation.Log;
import com.sj.demo.common.base.BaseController;
import com.sj.demo.common.domain.PageVo;
import com.sj.demo.common.enums.BusinessType;
import com.sj.demo.controller.TestController;
import com.sj.demo.service.sys.TableService;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * @Author: daixq
 * @Date: 2021/4/8 14:05
 * @Description:
 **/
@RestController
@RequestMapping("/api/gen")
public class GenerateController extends BaseController {

    @Value("${generate.domainPackage}")
    private String domainPackage;
    @Value("${generate.mapperPackage}")
    private String mapperPackage;
    @Value("${generate.xmlPackage}")
    private String xmlPackage;
    @Value("${generate.tableName}")
    private String tableName;
    @Value("${generate.entityName}")
    private String entityName;

    private static final String mysql = "mysql";

    @Resource
    private TableService tableService;


    @PostMapping("/genCode")
    public void genCode() {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        String genCfg = "/mybatis-generator/generatorConfig.xml";
        File configFile = new File(TestController.class.getResource(genCfg).getFile());
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = null;
        try {

            config = cp.parseConfiguration(configFile);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLParserException e) {
            e.printStackTrace();
        }
        config.getContext(mysql).getJavaModelGeneratorConfiguration().setTargetPackage(domainPackage);
        config.getContext(mysql).getJavaClientGeneratorConfiguration().setTargetPackage(mapperPackage);
        config.getContext(mysql).getSqlMapGeneratorConfiguration().setTargetPackage(xmlPackage);
        config.getContext(mysql).getTableConfigurations().get(0).setTableName(tableName);
        config.getContext(mysql).getTableConfigurations().get(0).setDomainObjectName(entityName);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = null;
        try {
            myBatisGenerator = new MyBatisGenerator(config, callback, warnings);

        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        }
        try {
            myBatisGenerator.generate(null);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @PostMapping("/tableQuery")
    @Log( title="获取工作流列表" ,businessType = BusinessType.OTHER)
    public PageVo tableQuery(){
        PageHelper.startPage(1,10);
        return getDataTable(tableService.queryTable("sj_work"));
    }
}
