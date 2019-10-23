def nom = 'miguel'

def  prenom = "yann"


pipeline{
    agent any
    stages{
        stage('build'){
            steps{
                echo 'bonjour'
            }
        }
    }
}
