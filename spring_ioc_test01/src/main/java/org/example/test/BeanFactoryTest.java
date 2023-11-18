package org.example.test;
import org.example.service.userservice;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import sun.security.util.math.IntegerModuloP;

public class BeanFactoryTest {
    public static void main(String[] args) {
        //1.创建工厂类
        DefaultListableBeanFactory dfltBF = new DefaultListableBeanFactory();
        //2.创建加载bean配置（即“SpringBeanManage.xml”）的读取器类，用于读xml配置文件
        XmlBeanDefinitionReader xmlBeanReader = new XmlBeanDefinitionReader(dfltBF);
        //3.加载bean配置的文件
        xmlBeanReader.loadBeanDefinitions("SpringBeanManage.xml");
        //4.工厂通过xml拿到bean
        userservice usBean = (userservice) dfltBF.getBean("UserserviceBean");

        System.out.println(usBean);
    }
}
