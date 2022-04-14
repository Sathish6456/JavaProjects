[2:31 PM] Kuragayala Sumanth
ActuatorIt helps you to monitor and manage
SPring boot actuator gives you number of Builtin end points and lets you add your own end poinnts
Optionally you can enable or disable each individual end points
Steps to use Actuator
1.Add the dependencies in pom.xm
2.optionally,add properties in application.properties file

http:/localhost:8080/actuator
This is a default endpoints given by actuator 
This end points tells you all the end points given by default 
General syntax of end points is as follows 
/actuator/id
id is built-in end point given by actuator 
ex:/actuator/health 
This end point gives us the health information about the application 
Enabling the atcuator end points 
management.endpoint.id.enabled=true
/actuator/beans= This endpoint displys complete list of beans configured in application