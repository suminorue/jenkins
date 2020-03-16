pipeline {
    agent { docker { image 'maven 3.6.3'}}
    stages {
        stage('build') {
            step {
                sh 'echo "Hello world"'
                sh 'mvn --version'
            }
        }
    }
}