pipeline {
    agent {
        docker { image 'node:jenkins-agent' }
    }
    stages {
        stage('Test') {
            steps {
                sh 'node --version'
            }
        }
    }
}
