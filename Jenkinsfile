pipeline 
{
    agent any
    
    tools 
    {
        maven 'Maven 3.6.2'
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
            
