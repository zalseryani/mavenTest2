pipeline 
{
  agent any
  
  stages
  {
     stage 'cleaning and compiling stage'
     {
        steps 
       {  
          bat "mvn clean compile"
       }  
     }
     
     stage 
     {
        steps 
       {  
          bat "mvn test"
       } 
     }
     
     stage 
     {
         steps 
       {  
          bat "mvn package"
       }
     }
  }
}
