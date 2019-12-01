pipeline 
{
    agent any
    
    tools 
    {
        maven 'maven'
        jdk "java"
    }
    
    stages 
    {
        stage('---clean---')
        {
            steps 
            {
                bat "mvn clean"
            }
        }
        
         stage('---compile---')
        {
            steps 
            {
                bat "mvn compile"
            }
        }
        
        
         stage('---package---')
        {
            steps 
            {
                bat "mvn package"
            }
        }
    }
}
            
