
pipeline{
    agent { label 'master'}
    stages{
        stage('build'){
            steps{
                sh 'javac ./*.java'
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