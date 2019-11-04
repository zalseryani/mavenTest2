pipeline 
{
    agent any
    stages 
    {
        stage('---clean---')
        {
            steps 
            {
                withMaven: (maven: maven_3_6_2)
                {
                    bat "mvn clean"
                }
            }
        }
    }
}
            
