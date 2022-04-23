pipeline {
    agent any
    stages { 
        stage('Clean') {
            steps {
                bat "mvn clean"
            }
        }
        stage('Test') {
            steps {
                bat "mvn test"
            }
        }
        stage('Package') {
            steps {
                bat "mvn package"
            }
        }
        stage('ConsolidateResults') {
            steps {
                input["Do you want to capture results?"]
                archive "target/*.jar"
            }
        }
    }
}