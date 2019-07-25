@Library("jenkins-share")
@Library("jenkins-share").org.share.bar.Local()
pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                  echo "hi pipeline"
                  script {
                         globalVars.info "info message"
                         globalVars.warning "warning message"
                         Local()
                }
            }     
            
        }
    }
}
