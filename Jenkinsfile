
pipeline{
    agent { label 'master'}
    stages{
        stage('build'){
            steps{
                sh 'javac src/*.java'
                echo "tout est OK"
            }
        }
        stage('test'){
              steps{
                sh 'java -cp junit-4.12.jar;. test/*.java'
             }

        }
    }
}