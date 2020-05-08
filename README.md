"# Product_demo" 
"# Product_demo" 
"# Product_demo" 

# ****Application for Basic Authentication using Spring boot***
# API Endpoint url
http://localhost:8080/product/api/{domian}/getproductdetails
EX ::
http://localhost:8080/product/api/banking/getproductdetails

Pls use the postman or google chrome testing above endpoint with Basic Auth

### User name :: admin 
### Password :: password

******Reference***

1. Create a project with following dependencies
	Spring web and 
	Spring security
  
 2 . Create an endpoint
	e.g. ProductController class
	The product/api/{domian}/getproductdetails  and /getproductconfig here is not accessible to customers.
	Since we have added a security dependency, this service is behind an authentication wall.
	So we cannot access it.
	
3. Let's do simple authentication to access this api.
      Create a WebSecurityConfig  (in SecurityConfig.java) extends WebSecurityConfigurerAdapter
      a. EnableWebSecurity by adding @EnableWebSecurity	
	    b. Here an  implemented configureGlobal( AuthenticationManagerBuilder) for define the username and password  .

