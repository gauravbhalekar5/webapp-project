# Pull base image 
From tomcat:8 

# Maintainer 
MAINTAINER "gauravbhalekar5@gmail.com" 
COPY ./webapp-project.war /usr/local/tomcat/webapps
