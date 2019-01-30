# wp-test-demo-java-selenium
Project to demonstrate my automation testing skills in Java, as part of my 2019 job search for SDET positions.

This suite of test cases runs Selenium-based test cases against a test Wordpress site.

# Prerequisites
To run this suite, I set up a test Wordpress site as well as a Selenium test hub using Docker Compose. You can see the wp-sel-docker-compose.yml file I use to set up the containers on my misc-configs repo.

The test data I'm using is a copy of one of my live Wordpress sites, which has provided me the items to fill in for my properties file.

The main tool I'm using to run the suite is IntelliJ. The IML file for IntelliJ is included in this repo, as well as the pom.xml, as this is set up as a Maven project. I use the Selenide Java framework to run the Selenium tests.

# Reference links
* [Misc-configs repo](https://github.com/annathepiper/misc-configs) where I store my Docker Compose yml files
* [Selenide](https://selenide.org/), the Selenium framework I'm using
* [IntelliJ](https://www.jetbrains.com/idea/)
