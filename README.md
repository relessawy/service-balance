#How to run locally and test

Make sure that EMS server is running and is accessible.

##launch the following command
		mvn spring-boot:run

##an alternative is to run the springboot jar file

		mvn package
		java -jar target/service-balance.jar

##run with JMX exporter for prometheus

		java -javaagent:target/jmx_prometheus_javaagent-0.10.jar=9779:configmaps/prometheus.yml -jar target/service-balance.jar

##get the soap api wsdl

		http://localhost:8080/soap-api/soap?wsdl

##get the swagger definition
	
		http://localhost:7123/rest-api/api-doc
	
##example of call to the rest service

		curl -X GET "http://localhost:7123/rest-api/enterprise-resources/auth/service/service-balances?service-id-type=sss&service-id=qqq" -H "accept: application/xml"
		curl -X GET "http://localhost:7123/rest-api/enterprise-resources/auth/service/service-balances?service-id-type=sss&service-id=qqq" -H "accept: application/json"
		curl -X GET "http://localhost:7123/rest-api/enterprise-resources/auth/service/service-balances?service-id-type=sss&service-id=qqq" -H "accept: SOME_WRONG_FORMAT"
		
		curl -X GET "http://localhost:7123/rest-api/backendurl" -H "accept: application/json"
		curl -X GET "http://localhost:7123/rest-api/backendwrapper?test=toto" -H "accept: application/xml"
		
if you want to change the backend endpoint edit the property file (property chargingSystemBackendUrl keep the netty4-http in front) 
		
		src/main/resources/application.properties

Note that you can also change the EMS configuration here.


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
Change the configmaps/application.properties if needed to set the backend url
	
		oc login -u developer
		oc create configmap --from-file=configmaps/application.properties service-balance-config
		oc create configmap --from-file=configmaps/prometheus.yml prometheus-config
		oc create -f service-balance.yml


Create and launch the app from the template
	
		oc new-app service-balance
	
To delete the app from openshift
	
		oc delete all -l app=service-balance
		oc delete configmap service-balance-config
		
Call rest api example 

		http://service-balance-rest-myproject.127.0.0.1.nip.io/rest-api/api-doc

		curl -X GET "http://service-balance-rest-myproject.127.0.0.1.nip.io/rest-api/enterprise-resources/auth/service/service-balances?service-id-type=sss&service-id=qqq" -H "accept: application/xml"

		curl -X GET "http://service-balance-rest-myproject.127.0.0.1.nip.io/rest-api/enterprise-resources/auth/service/service-balances?service-id-type=sss&service-id=qqq" -H "accept: application/json"
		
		curl -X GET "http://service-balance-rest-myproject.127.0.0.1.nip.io/rest-api/enterprise-resources/auth/service/service-balances?service-id-type=sss&service-id=qqq" -H "accept: SOME_WRONG_FORMAT"
		
		
		curl -X GET "http://service-balance-rest-myproject.127.0.0.1.nip.io/rest-api/backendurl" -H "accept: application/json"

		curl -X GET "http://service-balance-rest-myproject.127.0.0.1.nip.io/rest-api/backendwrapper?test=toto" -H "accept: application/json"
	
