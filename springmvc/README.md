README.mdBasically Three modules
* FrontController :  This is the dispaher servlet configured in the web.xml , which forwards the requests to the Handler Mapper
* Handler Mapper : Maps the request to the correct controller classs . After proceesing it returns the view to the Controller which will invoke the view resolver
* View Resolver : This add the correct location and extension for the views and return to the browser 
