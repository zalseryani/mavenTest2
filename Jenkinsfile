pipeline {
    agent any
    stages {
        stage('---clean---') {
            steps {
                bat "mvn clean compile"
            }
        }
        stage('--test--') {
            steps {
                bat "mvn test"
            }
        }
        stage('--package--') {
            steps {
                bat "mvn package"
            }
        }
    }
}
