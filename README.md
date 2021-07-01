# javaSeleniumWebBase
A base project is built by maven to test web using java, testng, selenium

# Run 
Execute "testng.xml" to run test
Report will be generated to test-output folder

# Run in command line using maven
mvn clean test -Dsurefire.suiteXmlFiles=testng.xml
Note : When running this way, report will be generated to target/surefire-reports
