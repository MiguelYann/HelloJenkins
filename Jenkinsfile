
pipeline{
    agent { label 'master'}
    stages{
        stage('build'){
            steps{
                sh 'javac /src/*.java'
                echo "tout est OK"
            }
        }
        stage('test'){
              steps{
                echo 'test'
             }

        }
    }
}