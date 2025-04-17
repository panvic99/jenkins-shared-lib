def call(Map s){
    node{
        sh 'ls -ltr'
        dir('Jenkins/maven-samples/single-module'){
            sh 'pwd'
            sh 'ls -ltr'
            pa = s.paths
            sh 'cd $pa'
           sh 'mvn package' 
           //sh 'false'
           
        }
    }
}