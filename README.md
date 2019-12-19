$ mvn archetype:generate -DgroupId=org.just4fun.test -DartifactId=helloworld -DarchetypeArtifactId=maven-archetype-webapp

$ mvn eclipse:eclipse -Dwtpversion=2.0

using jdk8

$ mvn clean package && cp target/helloworld.war $HOME/tomcat/apache-tomcat-6.0.53/webapps/

Expression Language statements either start with "${" or with "#{" and end with "}". JSP EL expressions are using the ${...} syntax. These EL expressions are immediately evaluated. JSF EL expressions are of the type #{...}. These are only evaluated when needed (and otherwise stored as strings).


jsf 2.3 released 2017 (current)

Facelets Technology
Facelets is an open source Web template system. It is a default view handler technology for JavaServer Faces (JSF). The language requires valid input XML documents to work. Facelets supports all of the JSF UI components and focuses completely on building the view for a JSF application.



Eager Managed Bean
Managed bean is lazy by default. It means, bean is instantiated only when a request is made from the application.

You can force a bean to be instantiated and placed in the application scope as soon as the application is started. You need to set eager attribute of the managed bean to true as shown in the following example:

@ManagedBean(eager=true)  

Tag Library				URI					Prefix	Example					Contents
JavaServer Faces Facelets Tag Library	http://xmlns.jcp.org/jsf/facelets	ui:	ui:component ui:insert			Tags for templating
JavaServer Faces HTML Tag Library	http://xmlns.jcp.org/jsf/html		h:	h:head h:body h:outputText h:inputText	JavaServer Faces component tags for all UIComponent objects
JavaServer Faces Core Tag Library	http://xmlns.jcp.org/jsf/core		f:	f:actionListener f:attribute		Tags for JavaServer Faces custom actions that are independent of any particular render kit
Pass-through Elements Tag Library	http://xmlns.jcp.org/jsf		jsf:	jsf:id					Tags to support HTML5-friendly markup
Pass-through Attributes Tag Library	http://xmlns.jcp.org/jsf/passthrough	p:	p:type					Tags to support HTML5-friendly markup
Composite Component Tag Library		http://xmlns.jcp.org/jsf/composite	cc:	cc:interface				Tags to support composite components
JSTL Core Tag Library			http://xmlns.jcp.org/jsp/jstl/core	c:	c:forEach c:catch			JSTL 1.2 Core Tags
JSTL Functions Tag Library		http://xmlns.jcp.org/jsp/jstl/functions	fn:	fn:toUpperCase fn:toLowerCase		JSTL 1.2 Functions Tags


Test
------
https://blogs.oracle.com/javamagazine/testing-html-and-jsf-based-uis-with-arquillian
https://github.com/juneau001/ArquillianExampleUI
https://bitbucket.org/javamagazine/magdownloads/wiki/2019%20Articles
