pipeline {
    agent any
    environment {
        
        NEW_VERSION ='1.3.0'
    }
  
  stages {
    stage("build"){
      steps{
          echo "building the version ${NEW_VERSION}"
      }
    }
    stage("test"){
      steps{
        echo 'testing the application ....'
      }
    }
    stage("deploy"){
      steps{
        cat "/var/jenkins_home/secrets/master.key"
      }
    }
  }
 
  
}
