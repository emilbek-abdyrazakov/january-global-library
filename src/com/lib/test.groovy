def say_hello() {
    node {
        stage("Stage1"){
            sh "echo Hello World!"
        }
        stage("Stage1"){
            sh "echo Hello World!"
        }
    }
} 