@Library("jenkins-share")_
import org.share.Bar
pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                  echo "hi pipeline"
                  script {
                         globalVars.info "info message"
                         globalVars.warning "warning message"
                         bar.local()
                }
            }     
            
        }
    }
}
