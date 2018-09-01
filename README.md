# quandoo_task_solution
<hr/>
<p>This is the BDD automation solution for testing web-app: https://the-internet.herokuapp.com/</p>

<h3>Thechnologies used:</h3>
<ul>
<li><b>Programming language:</b> Java 8</li>
<li><b>Build tool:</b> Maven</li>
<li><b>Testing library:</b> JUnit</li>
<li><b>Browser driver:</b> Selenium WebDriver with Selenide wrapper</li>
<li><b>BDD tool:</b> Cucumber for Java 8
</ul>
<hr/>

<h3>Solution overview:</h3>

<ul>
<li>src/main/task/quandoo folder contains: Custom exceptions, page object and utils (PropertyReader and WebDriverManager)</li>
<li>src/main/task/resources: there driver and properties file with all the constants and settings</li>
<li>src/test/java/quandoo: there class to run the tests and all the steps definitions</li>
<li>src/test/resources/: there all the feature files</li>
</ul>
<hr/>

<h3>What was tested:</h3>
<ul>
<li>Login page: scenarios with correnct credentials, wron username and wrong password</li>
<li>Tables page: Sorting "Example 2" table by Last Name parameter</li>
<li>Hovers page: Checked that if we hover user avatar correct user name is appared.</li>
</ul>
<hr/>

<h3>Preconditions before using solution:</h3>
<ul>
<li>Download and install JDK for 8 Java</li>
<li>Downloadand install Maven ltest version</li>
<li>You need Chrome and Firefox browsers</li>
</ul>
<hr/>

<h3>How to run tests:</h3>
<p><pre>
1. Clone this repository. 
2. Go to the root folder of the repo. 
3. Open terminal and type: mvn test 
4. By default test will run in Chrome browser, to run in FireFox in config.properties file set: firefox for browser property</pre></p>
