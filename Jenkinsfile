pipeline {
    agent any
    stages {
        stage('---clean---') {
           steps {
                
                withMaven (maven: "maven_3_6_2"){
                    bat "mvn clean"
                }
        }
        stage('--test--') {
            steps {
                
                withMaven (maven: "maven_3_6_2"){
                    bat "mvn test"
                }
            }
        }
        stage('--package--') {
            steps {
                
                withMaven (maven: "maven_3_6_2"){
                    bat "mvn package"
                }
        }
    }
}
