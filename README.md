# record-locator-with-medtech
A record locator microservice and a Med Tech microservice each with their own databases.


* Ensure that Docker desktop is running if you are working from a windows machine.
* Run `docker-compose -f medtech-compose.yml -f record-compose.yml up --build -d` to build the med tech application and db ad the record locator application and db.

* When both compose files have built successfully open your search engine of choice and lookup `localhost:8080/medtech this will take you to a forms page with text boxes to input patient information 
* Enter in patient information and click submit 
* A webpage should return with the statement "Patient submitted successfully" and the patients NHI number

* To Test to see if the record has successfully been recorded in the record locator database in Postman import the  rl-test.json file and run the Get request with the NHI number you submitted to the MedTech web form.
* The output should be a 200 OK status and an array of Record Locator objects showing the recordLocatorId systemId, dataType, and the patientId which will be equivalent to the NHI.
