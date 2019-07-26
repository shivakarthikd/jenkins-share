

def call(Map args) {
    pipeline {
        agent any
        stages {
            stage('build') {
                steps {
                    echo "hi pipeline"
                    script {
                        globalVars.info args.v1
                        globalVars.warning args.v2

                    }
                }

            }
        }
    }
}
