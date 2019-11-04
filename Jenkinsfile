pipeline 
{
  agent any
  
  stages
  {
     stage 'cleaning and compiling stage'
     {
        bat mvn "clean compile"
     }
     
     stage 
     {
        bat "mvn test"
     }
     
     stage 
     {
        bat "mvn package"
     }
  }
}
