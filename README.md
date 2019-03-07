 SpringMVCFreemarker视图解析：
	<!-- 整合Freemarker -->
	<!-- 放在InternalResourceViewResolver的前面，优先找freemarker -->
	<bean id="freemarkerConfig" class="org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer">
	    <property name="templateLoaderPath" value="/WEB-INF/views/templates"/>
	</bean>
	<bean id="viewResolver" class="org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver">
	    <property name="prefix" value=""/>
	    <property name="suffix" value=".ftl"/>
	    <property name="contentType" value="text/html; charset=UTF-8"/>
	</bean>
	<!-- 配置视图解析器 -->
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix" value="/WEB-INF/views/"></property>
		<property name="suffix" value=".jsp"></property>
	</bean>
	<!-- 配置注解驱动 -->
	<mvc:annotation-driven />
	<!-- 配置视图  BeanNameViewResolver 解析器
		使用视图的名字来解析视图
		通过 order 属性来定义视图解析器的优先级, order 值越小优先级越高
	-->
	<bean class="org.springframework.web.servlet.view.BeanNameViewResolver">
		<property name="order" value="100"></property>
	</bean>
	<!-- 配置直接跳转的页面，无需经过Controller层
		http://localhost:8080/springmvc/index
		然后会跳转到 WEB-INF/views/index.jsp 页面
	-->
	<mvc:view-controller path="/index" view-name="index"/>
