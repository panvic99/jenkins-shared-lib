def call(Map s){
    node{
        sh 'ls -ltr'
        sh 'pwd'
        sh 'ls -ltr'
        pa = s.paths
        echo '$pa'
        dir('Jenkins/maven-samples/single-module'){}
        sh 'mvn package' 
        //sh 'false'
           
        }
    }
}