def newGit(repo)   
{
  git "https://github.com/SuprabathKristam/${repo}.git"
}
def newGitTest(repo)
{
  git "https://github.com/intelliqittrainings/${repo}.git
}
def mavenBuild()
{
  sh 'mvn package'
}
def deployment(jobname,ipaddress,context)
{
  sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ipaddress}:/var/lib/tomcat9/webapps/${context}.war"
}
