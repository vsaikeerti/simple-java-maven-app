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
                git branch: 'dev', url: 'https://github.com/vsaikeerti/simple-java-maven-app.git'
            }
        }
        stage("Build the code"){
            steps {
                sh """
                cd simple-java-maven-app
                mvn clean install --DskipTests
                """
            }
        }
//         stage("Test") {
//             steps {
//                 dir("simple-java-maven-app"){
//                     sh "mvn test -DtestFailureIgnore=true"
//                 }
//             }
//         }
        
        stage(" Runngin the codeeee"){
            steps{
                sh """
                cd simple-java-maven-app/target
                java -jar my-app-1.0-SNAPSHOT.jar
                """
            }
        }
    }
}
