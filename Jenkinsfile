@Library("jenkins-share")_
pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                  echo "hi pipeline"
                  script {
                    Global_vars 'info message'
                    Global_vars 'warning message'
                  } 

            }
        }
    }
}
