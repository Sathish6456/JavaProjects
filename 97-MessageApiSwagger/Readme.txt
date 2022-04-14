Swagger 2 
it is an open source project used to generate rest api documentation 
it also gives you an user interface to access your rest end point via browser 
following are the steps to carried out in order to use swagger in application 
1)Add dependancy in pom.xml
2)Configure swagger
3)Enabling swagger 
4)Adding more annnotations for detailed customized requirements(Optional)


http://localhost:8080/v2/api-docs 

v2/api-docs 
This Endpoint is given by swagger which is rest endpoint which return rest endpoints documentation is json form
idea is you can consume this endpoint and create custom gui 
if you don't want to create custom gui swagger gives you build in gui and saves lot of efforts of developper 
you can use this build in gui to test rest end points 

Following dependancy:
http:localhost:8080/swagger-ui.html we can get the detailed structured in the web 

important annotation which helps you to customize documentations 
1)@ApiOperation - this is used on top of rest controller method 
	@ApiOperation(value="this fetches messages from database")  it writes some matter insteadof methodname 
	ex:GET
/api/message this fetches messages from database	//by using the api operation we can give some instead of method name
/api/message createMessage 							//in this case we are not using the the api operation so it shows method name

2)ApiModel
	in the same we are using the @ApiModel annotation top of the class,it has 2 attributes
	value:this displays the name of model class 
	description:this gives the description about the model class
3)ApiModelProperty-
	This was used for additional information 
	ex; we can give an information above the id
	
4)ApiParam
This is used with argument of rest controller method it following 2 attributes 
value:This is short description 
required:This tell if the parameter is optional or required
(@ApiParam(value="This is an id on bases on which message will be fetch",required = true) @PathVariable int id)

--------------------------***********----------
NOTE:Using Swagger Annontation in your entity class to customize swagger documentation is not a good choice as we are touching changing
our business object 

we need better approach so that our entity class remains untouched 
have to do it ?
