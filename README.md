# Wordpress Test Demo with Java and Selenium
This is one of several related repositories on my Github, all of which are part of a project to demonstrate my automation abilities as an SDET. I originally set up these projects in 2019 as part of my job search that year, and returned to refresh them in 2023. The overall goals of these projects are as follows:

1. Provide myself a way to practice my coding skills to keep them fresh
2. Have concrete examples of my work to provide to potential employers
3. Provide examples for other SDETs out there to by if they're seeking to accomplish similar automation goals

All of the repositories involved in this project are along the same theme: conducting automated tests against a test Wordpress site.

## About the test Wordpress site
The test site used for all of these repositories is a subset of data copied off one of my live Wordpress sites, https://angelahighland.info, which provides me the information to fill out test properties in the various projects. I set up the test site using Docker containers, and Docker Compose to manage them.

Please refer to the wiki over on my [misc-configs](https://github.com/annathepiper/misc-configs) repo, where I'll go into detail about how I set up the site.

## About the tests done on this repo
The test suite in this repository is written in Java, and conducts Selenium-based tests against the Wordpress site's front end.

I am *not*, however, using standard Selenium Java syntax. I'm using a framework called [Selenide](https://selenide.org), which I like in no small part because it eliminates some of the heavy lifting you have to do when running Selenium, such as worrying about launching a driver and shutting it down again when you're done. See Selenide's site for more information about their framework.

The suite is a Maven project, written in IntelliJ, and uses TestNG to power the tests and conduct all relevant asserts.

As of July 2023, all project dependencies have been refreshed. All test cases are confirmed to pass in Windows 10, against Docker containers for the Chrome, Edge, and Firefox browsers. Confirmation of the tests running successfully on MacOS and Linux is pending.

## Related repositories
* [wp-test-demo-java](https://github.com/annathepiper/wp-test-demo-java)
* [wp-test-demo-python](https://github.com/annathepiper/wp-test-demo-python)
* [wp-test-demo-python-selenium](https://github.com/annathepiper/wp-test-demo-python-selenium)
* [wp-test-demo-c-sharp](https://github.com/annathepiper/wp-test-demo-c-sharp)
* [misc-configs](https://github.com/annathepiper/misc-configs)

## If you want more information
Please see the wiki on this repo for more in-depth information about this part of the project.
