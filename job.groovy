node (){
    stage ('shell command'){
        sh label: '', script: '''uptime
        hostname'''
    }
}
