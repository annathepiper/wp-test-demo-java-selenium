# wp-test-demo-java-selenium
Project to demonstrate my automation testing skills in Java, as part of my 2019 job search for SDET positions.

This suite of test cases runs Selenium-based test cases against a test Wordpress site.

## Prerequisites
To run this suite, I set up a test Wordpress site as well as a Selenium test hub using Docker Compose. You can see the wp-sel-docker-compose.yml file I use to set up the containers on my misc-configs repo.

The test data I'm using is a copy of one of my [live Wordpress sites](http://angelahighland.wordpress.com), which has provided me the items to fill in for my properties file.

The main tool I'm using to run the suite is IntelliJ. The IML file for IntelliJ is included in this repo, as well as the pom.xml, as this is set up as a Maven project. I use the Selenide Java framework to run the Selenium tests.

### Maven dependencies

Dependencies included in the POM are:

* Selenide
* TestNG
* Surefire (with exclusion on log4j to force using version 2)
* Log4j (version 2)

Dependencies were last updated in the POM as of 7/3/2020.

## Skills and tech I'm demonstrating here
* Use of a properties file to set test-specific strings like ID numbers, titles, and names
* Using TestNG functionality to run the test suite, and to annotate test methods
* Use of a POM file to set Maven dependencies and to run the test suite via Maven as well as TestNG
* Testing against a site running as a Docker container
* Using Selenium as a Docker container, and configuring Selenide to point to that
* Use of Selenide as a framework to run Selenium tests
* Using inheritance to not only do setup in a BaseTest class and pass it down to all the children, but also to pass specific tests from a parent test class to a child so that I can do the same tests against different parts of the site

## Why Selenide?

I'm using Selenide to do the Selenium work here as it does the heavy lifting necessary to interact with Selenium. For example, it takes care of launching the Selenium driver for me, and doing the low-level processing necessary to find and interact with items on a page. This frees me up to focus on writing the specific test cases I want.

See the [Selenide](https://selenide.org/) site for more information on the syntax it uses for test case writing.

## Running the code yourself
If you'd like to try running this suite yourself, you will need to do the following:

1. Install IntelliJ IDEA if you don't have it already.
2. Install Docker if you don't have it already.
3. Install git if you don't have it already.
4. Grab one of my Docker Compose YAML files out of my misc-configs repo. If you have your own instance of Selenium running already, you can get wp-docker-compose.yml. Otherwise, use wp-sel-docker-compose.yml.
5. Use the YAML file you select to launch your local instance of Wordpress, and modify it as necessary with your own test data. This may involve importing data of your own in from another site, or otherwise generating test posts, pages, etc. via whatever means you have available.
6. Check out this repo on your own system.
7. Import the project into your IntelliJ.
8. In IntelliJ, use the testng.xml file to create a configuration you can use to run the test cases. It's a suite file, so you'll want to choose "Suite" in the configuration settings. All other settings can remain as default.
9. Open the wp-test-demo.properties file and edit it as appropriate to reflect what test data you're using.

### Docker Compose YAML files
Which of my YAML files you want to use depends on whether you have your own local instance of Selenium already.

* wp-docker-compose.yml sets up only a test Wordpress instance, the MySQL layer that powers it, and an instance of PHPMyAdmin if you want to get into the database.
* wp-sel-docker-compose.yml does the same things as the previous file, but also sets up a Selenium grid, with one Firefox node and one Chrome one.

You only need one or the other of these. You can use Docker Compose to launch them by name with the -f flag.

### Selenium dependencies
If you use my Docker Compose YAML file to set up a Selenium instance, it creates it by default at localhost with port 4444. If you don't want to use port 4444, edit the file to use a different port.

The location for this grid is set in the properties file for the suite as "seleniumHost". If you have your own Selenium instance set up, or if you change what port you're using in the YAML file, you should update the properties file to reflect your changes.

### Running the code on a Linux environment

This code has been successfully most recently run against IntelliJ Community Edition 2020.1.2, on an Ubuntu Linux install (Ubuntu 20.04 LTS) with OpenJDK version 1.8 installed.

## Reference links
* [Misc-configs repo](https://github.com/annathepiper/misc-configs) where I store my Docker Compose yml files
* [Selenide](https://selenide.org/), the Selenium framework I'm using
* [IntelliJ](https://www.jetbrains.com/idea/)
