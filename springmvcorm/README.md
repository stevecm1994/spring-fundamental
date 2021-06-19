# Concepts in this project

Implemented User Data Saving to DB , Fetching User Data to DB , Validation of userID availability 

## Backend Modules

### Controller Layer : 

* @RequestMapping("registrationPage") : Mapping that serves the user registration page
* @RequestMapping(value = "registerUser", method = RequestMethod.POST) : Mapping that handles post method to saving data to DB
* @RequestMapping("getUsers") : Mapping that retrieves all user profiles from DB
* @RequestMapping("validateUser") : Mapping that checks if there is any already existing user with the given userID

### Service Layer :

* @Service annotated
* Layer that wraps all the extra logic done based on the data revived from DB. In this project there no specific logic implemented
* Usually methods in service layer are wrapped with transactions annotations

### Data Access Layer :

* @Repository annotated
* Layer that handles the talking to DB

### Entity Classes : 

* @Entity  @Table(name="tableName") annotated classes ,  @ID annotated variables
* These are the data model classes that resembles the column names in the mentioned table in data base

### Dependency injected by spring :

* org.springframework.orm.hibernate5.HibernateTemplate : This HibernateTemplate require other dependency org.springframework.orm.hibernate5.LocalSessionFactoryBean.  
* org.springframework.orm.hibernate5.LocalSessionFactoryBean : This LocalSessionFactoryBean require following properties to be defined : hibernateProperties( hibernate.dialect ,hibernate.show_sql), annotatedClasses(class corresponding to data model) . This class also require other dependency org.springframework.jdbc.datasource.DriverManagerDataSource 
* org.springframework.jdbc.datasource.DriverManagerDataSource : Data source for JDBC connection
* org.springframework.orm.hibernate5.HibernateTransactionManager : This is for transaction  annotations . This HibernateTransactionManager also require the dependency org.springframework.orm.hibernate5.LocalSessionFactoryBean.
* org.springframework.web.servlet.view.InternalResourceViewResolver : This is for the view resolver . Properties like prefix and suffix mentioned here
* Other annotated classes like UserDaoImpl , UserServicesImpl injected using @Autowired annotations when required





