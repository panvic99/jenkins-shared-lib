def call(){
    node{
        sh 'ls -ltr'
        dir('Jenkins/maven-samples/single-module'){
            sh 'ls -ltr'
           sh 'mvn package' 
           //sh 'false'
           
        }
    }
}