def call(Map s){
    node{
        sh 'ls -ltr'
        sh 'pwd'
        sh 'ls -ltr'
        echo 'path in lib : ${s.paths}'
        dir(s.paths){
            sh 'mvn package' 
        }
        
        //sh 'false'
    }
}