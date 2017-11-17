#How to run locally and test

##launch the following command
	mvn spring-boot:run

##an alternative is to run the springboot jar file

	mvn package
	java -jar target/service-balance-1.0-SNAPSHOT.jar

##get the soap api wsdl

	http://localhost:8080/soap-api/soap?wsdl

##get the swagger definition
	
	http://localhost:7123/rest-api/api-doc?
	
##example of call to the rest service

	curl -X GET "http://localhost:7123/rest-api/enterprise-resources/auth/service/service-balances?service-id-type=sss&service-id=qqq" -H "accept: application/xml"


#How to deploy on openshift

Connect to openshift and make sure image stream is on openshift namespace
if not import the image stream

	oc create -f https://raw.githubusercontent.com/jboss-fuse/application-templates/GA/fis-image-streams.json

Import the template for this project

	
	
	
