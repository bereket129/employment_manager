def app

pipeline {
    agent any
    parameters {
        string(name: 'branchName', defaultValue: '',description: 'Version to deploy on prod')
        choice(name: 'pipeline', choices: ['main','master','dmc8384'], description: 'name of branch')
        string(name: 'tag', defaultValue: 'latest', description: 'tag name for the image')
        booleanParam(name: 'DeployToDev', defaultValue: true,  description: 'Do you want to deploy this to dev?')
    }
  
  stages {
    stage("build"){
        app = docker.build("abusha129/newapp")
      
    }
    stage("test"){
      steps{
        echo 'testing the application ....'
      }
    }
      
      stage("push image"){
          docker.withRegistry('https://registry.hub.docker.com','docker'){
              app.push("employeeManager")
              app.push("latest")
          }
      }
      
      stage("deploy"){
          when{
              expression{params.DeployToDev}
              
          }
      steps{
        sh "ls -a"
      }
    }
  }
 
  
}
