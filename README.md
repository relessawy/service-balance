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

Connect to openshift with an admin account and make sure image stream is on openshift namespace
if not import the fis image stream

	oc login -u system:admin
	oc create -n openshift -f https://raw.githubusercontent.com/jboss-fuse/application-templates/GA/fis-image-streams.json

Edit the file service-balance.yml and change the following variables according to your environment. In example

	GIT_REPO : point to the git repo of this project
	IMAGE_STREAM_NAMESPACE : the namespace where the fis-image-stream was imported
	MAVEN_MIRROR_URL : url to your maven repo (ie nexus)

Login in to developer account import the template for this project
	
	oc login -u developer
	oc create -f service-balance.yml

Create and launch the app from the template
	
	oc new-app service-balance
	
To delete the app from openshift
	
	oc delete all -l app=service-balance
	

	
	
	
