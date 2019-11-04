pipeline 
{
    agent any
    stages 
    {
        stage('---clean---')
        {
            steps 
            {
                withMaven: (maven)
                {
                    bat "mvn clean"
                }
            }
        }
    }
}
            
