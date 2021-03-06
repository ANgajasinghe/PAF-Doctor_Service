# PAF-Doctor_Service
HelthCare is a hospital management system where the registered users can make appointments with the registered doctors who visit the registered hospitals. The users can even make the payments for the appointments online. 

**<small>please read <i><b>"How To Run the Project"</i></b> section to run project.
<p></p>
<h4> -- project architecture -- </h4>
<ul>
	<li>#UTILITY :-</li>
	<br>
	<small><ol>
			<li>Server(doctors) class diagram</li>
			<li>database backup(s)</li>
			<li>configuration Zip file :- contains database connection builder xml file.</li>
			<li>apache09 :- doctor.war and web.xml .</li>
			</ol>
	</small>
	<br>
	<li>Client :- </li>
	<br>
	<small><ol>
			<li>lib folder :- includes all client-side libraries (<i>jQuery-3.5.0,bootstrap,fontawesome</i>) </li>
			<li>app.css :- main css.</li>
			<li>app.js :- include all DC according to MVC architecture.</li>
			<li>index.html :- from and grid view</li>
			</ol>
	</small>
	<br>
	<li>doctors :- </li>
	<br>
	<small><ol>
			<li> include all server side implementation  </li>
			<li> MYSQL connection builder using Connection.xml </li>
			</ol>
	</small>
</ul>	

<p></p>
<h4> -- Project configuration -- </h4>

<h5>Requirements</h5>
<ul>
	<li>web browser(chrome)</li>
	<li>Apache Tomcat (v9)</li>
	<li>Eclipse IDE (optional)</li>
	<li>zip Extractor</li>
	<li>XAMMP (MYSQL)</li>
</ul>	

<h5>To Run the Project</h5>
<ol type="1">
<u> Server-side configuration </u>
<br>
<li> Create a database. </li>
<br>
<b><small>From #UTILITY Directory,</small></b>
<li> Extract the IT18153682.zip into the<b> C drive </b> in your PC.(important) </li>
<li> Import given MYSQL back-up to your created database from #UTILITY Directory </li>
<li> <b>Extracted folder(IT18153682)</b> has a file called <b>Connection.xml</b>. Open that and <b>configure your Database information</b>. </li>
<p></p>
<li>You can run the server-project(doctors) in the eclipse IDE using tomcat(recommend) or you can deploy doctors.war(#UTILITY -> aparche09 directory) file into apache(weabapps) directly. </li>
<br>
<i><b>**If you only deployed .war file</b></i>
<li>Enable CorsFilter in apache server
You must configure apache's web.xml (in conf directory) according to my <b>web.xml</b> (in #UTILITY -> aparche09 directory)
<br>
<small><b><i>**this process might affect to eclipse projects. if it's happened please undo the web.xml changes.and restart apache and eclips </i></b></small> 

</ol>
<br>
<ol type="1">
<u>Client-side configuration</u>
<li>Open Client Directory</li>
<li>If you want, you can change the host name through _URL() (Client->app.js) function</li>.
 <li>Run index.html page in the web browser(chrome)
 <br>
 <small><b><i>**Client is not a java project it's only a jQuery project</i></b></small>
 </li>
 </ol>
 

