 ** Installation errors of the application have been corrected.  ***
 
 

  Errors have been fixed when trying to create files in GTFS format.

  Updated xml schema format. Fiexd xml errors.

  Updated Maven POMS.

  2.1 version updated 2.2
  
  Maven error fixed
  
  Spring roles fixed.
  
  Eclipse version upgraded.
  
 You can add mobile coordinate info for android and ios mobile and  You can find coordinate info {yoururl}\onebusaway-api-webapp/api//where/agencies-with-coverage.json?key=OBA

 First Steps

 Install ubuntu.
 You can create /var/lib/oba folder  
 Copy config.json in /var/lib/oba folder
 Install Tomcat 8.5
 Tomcat webapp folder copy
 onebusaway-admin-webapp.war
 onebusaway-api-webapp.war

export CATALINA_OPTS="-Djava.awt.headless=true -Xss4m -Xmx2g -XX:+UseConcMarkSweepGC" 
run tomcat then extract war file to tomcat folder 
