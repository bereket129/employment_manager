pipeline {
    agent any
    parameters {
        string(name: 'branchName', defaultValue: '',description: 'Version to deploy on prod')
        choice(name: 'pipeline', choices: ['main','master','dmc8384'], description: 'name of branch')
        string(name: 'tag', defaultValue: 'latest', description: 'tag name for the image')
        boolean(name: 'DeployToDev', defaultValue: true,  description: 'Do you want to deploy this to dev?')
    }
  
  stages {
    stage("build"){
      steps{
          echo "building the version ${branchName}"
      }
    }
    stage("test"){
      steps{
        echo 'testing the application ....'
      }
    }
    stage("deploy"){
        when{
            params.DeployToDev
        }
      steps{
        sh "cat /var/jenkins_home/secrets/master.key"
      }
    }
  }
 
  
}
