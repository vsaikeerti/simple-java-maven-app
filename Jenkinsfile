pipeline {
    agent any
    stages {
        stage(" my Clean Up"){
            steps {
                deleteDir()
            }
        }
        stage("Clone repo"){
            steps {
                checkout scm
            }
        }
        stage("Build"){
            steps {
                dir("simple-java-maven-app"){
                    sh "mvn clean install"
                }
            }
        }
        stage("Test") {
            steps {
                dir("simple-java-maven-app"){
                    sh "mvn test"
                }
            }
        }
        
        stage(" Runngin the code"){
            steps{
                sh """
                cd simple-java-maven-app/target
                java -jar my-app-1.0-SNAPSHOT.jar
                """
            }
        }
    }
}
