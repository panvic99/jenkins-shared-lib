def call(){
    node{
        sh 'ls -ltr'
        dir('Jenkins/maven-samples/single-module'){
           sh 'mvn package' 
           //sh 'false'
           sh 'ls -ltr'
        }
    }
}