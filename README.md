# address-book-application

The Application contains the contact details of the entries

Url: https://github.com/gitsandyblr/address-book-application

How to use:
1. git clone https://github.com/gitsandyblr/address-book-application
2. ./gradlew build
3. ./gradlew bootRun
4. http://localhost:8080/addressbook/v1.0/addEntry 
5. enter basic authentication 
    username: admin
    password: password
    
    json payload:
        {
        	"name": "Bechan",
        	"phoneNumber": "+6199999"
        }
        
Swagger:
    http://localhost:8080/swagger-ui.html
    
H2 database:            
    url: http://localhost:8080/h2
    username: sa
    password: 
    -> click on connect
    