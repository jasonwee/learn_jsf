$ mvn archetype:generate -DgroupId=org.just4fun.test -DartifactId=helloworld -DarchetypeArtifactId=maven-archetype-webapp

$ mvn eclipse:eclipse -Dwtpversion=2.0

using jdk8

$ mvn clean package && cp target/helloworld.war $HOME/tomcat/apache-tomcat-6.0.53/webapps/

Expression Language statements either start with "${" or with "#{" and end with "}". JSP EL expressions are using the ${...} syntax. These EL expressions are immediately evaluated. JSF EL expressions are of the type #{...}. These are only evaluated when needed (and otherwise stored as strings).

