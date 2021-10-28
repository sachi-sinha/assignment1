pipeline {
    agent {
        docker { image 'jenkins-blueocean' }
    }
    stages {
        stage('Test') {
            steps {
                sh 'node --version'
            }
        }
    }
}
