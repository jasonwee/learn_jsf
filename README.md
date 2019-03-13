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
