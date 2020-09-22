# employeeserv

URL to test 
===========

Use post man to test the apis, and it has in memory DB. so each time when application restarts, 
the data gets erased, so whatever data is created , should retrieve the same,

GEt URL
-=======
http://localhost:8080/v1/bfs/employees/1 --> 1 is ID

POST URL
========
http://localhost:8080/v1/bfs/createemployee

Request:
========
{
	"name":"Master",
	"dob":"20-10-1989",
	"address":{
		"line1":"113 lake view st",
		"line2":"St. mark",
		"city":"Croydon",
		"state":"New Jersey",
		"country":"US",
		"zipcode":"23434"
	}
}
