pipeline {
    agent {
        docker { image 'node:jenkins-agent' }
    }
    stages {
        stage('Build') {
            steps {
               sh 'chmod +x gradlew'
               sh './gradlew clean build'
            }
        }
    }
}
