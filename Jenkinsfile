pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                bat 'gradle build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploying') {
            steps {
                echo 'Deploying..'
            }
        }
    }
}
