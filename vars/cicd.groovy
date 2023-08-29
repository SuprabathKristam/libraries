def newGit(repo)   
{
  git "https://github.com/SuprabathKristam/${repo}.git"
}
def mavenBuild()
{
  sh 'mvn package'
}
