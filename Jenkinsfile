pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'App Build successfully'
      }
    }
    stage('Test') {
      agent any
      environment {
        CI = 'true'
      }
      steps {
        echo 'Testing'
      }
    }
  }
}