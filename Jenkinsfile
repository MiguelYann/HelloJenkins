
pipeline{
    agent { label 'master'}
    stages{
        stage('build'){
            steps{
                sh 'javac testJenkins/src/*.java'
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