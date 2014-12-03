Get started with DemoApp20141111
-----------------------------------
Welcome to Java Web Starter application!

This sample application demonstrates how to write a Java Web application (powered by WebSphere Liberty) and deploy it on Bluemix.

1. [Install the cf command-line tool](https://www.ng.bluemix.net/docs/#starters/BuildingWeb.html#install_cf).
2. [Download the starter application package](https://console.ng.bluemix.net:443/rest/../rest/apps/846febc1-dad9-4b3c-bf7f-00b05d69fa05/starter-download).
3. Extract the package and `cd` to it.
4. Connect to Bluemix:

		cf api https://api.ng.bluemix.net

5. Log into Bluemix:

		cf login -u dalkluna@163.com
		cf target -o dalkluna@163.com -s dev
				
6. Compile the Java code and generate the war package using Eclipse or ant.
7. Deploy your app:

		cf push DemoApp20141111 -p webStarterApp.war

8. Access your app: [http://DemoApp20141111.mybluemix.net](http://DemoApp20141111.mybluemix.net)
9. You can also import the starter application package into Eclipse and [Deploy using IBM Eclipse Tools for Bluemix](https://www.ng.bluemix.net/docs/#manageapps/eclipsetools.html#eclipsetools).
