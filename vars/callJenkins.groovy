@Library("jenkins-share")

def call() {
    pipeline {
        agent any
        stages {
            stage('build') {
                steps {
                    echo "hi pipeline"
                    script {
                        globalVars.info "info message"
                        globalVars.warning "warning message"

                    }
                }

            }
        }
    }
}
