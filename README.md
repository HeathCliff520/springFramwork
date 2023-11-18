# springFramwork
黑马听课笔记：https://www.bilibili.com/video/BV1rt4y1u7q5/?p=2&amp;spm_id_from=pageDriver&amp;vd_source=3a388d296ad5d4ec5d3aed0300c5ddc8

## spring用Bean工厂实现java类管理
1. 创建maven工程，pom文件中导入spring-context坐标
2. 用xml文件记录spring要管理的类
    ```
   SpringBeanManage.xml文件中：
    <bean id="UserserviceBean" class="org.example.service.impl.userserviceImpl"></bean>
   ```
3. 通过bean工厂类用bean
    ```java
        //1.创建工厂类
        DefaultListableBeanFactory dfltBF = new DefaultListableBeanFactory();
        //2.创建加载bean配置（即“SpringBeanManage.xml”）的读取器类，用于读xml配置文件
        XmlBeanDefinitionReader xmlBeanReader = new XmlBeanDefinitionReader(dfltBF);
        //3.加载bean配置的文件
        xmlBeanReader.loadBeanDefinitions("SpringBeanManage.xml");
        //4.工厂通过xml拿到bean
        userservice usBean = (userservice) dfltBF.getBean("UserserviceBean");
        System.out.println(usBean);
   
   ```