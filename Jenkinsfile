@Library("jenkins-share")
import org.share.bar
pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                  echo "hi pipeline"
                  script {
                         globalVars.info "info message"
                         globalVars.warning "warning message"
                         echo bar.Local()
                }
            }     
            
        }
    }
}
