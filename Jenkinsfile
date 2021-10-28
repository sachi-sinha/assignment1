pipeline {
    agent any 
    stages {
        stage('Test') {
            steps {
                build wait: false, job: 'assignment1'
            }
        }
    }
}
