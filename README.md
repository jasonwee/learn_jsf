$ mvn archetype:generate -DgroupId=org.just4fun.test -DartifactId=helloworld -DarchetypeArtifactId=maven-archetype-webapp

$ mvn eclipse:eclipse -Dwtpversion=2.0

using jdk8

$ mvn clean package && cp target/helloworld.war $HOME/tomcat/apache-tomcat-6.0.53/webapps/
