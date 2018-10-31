pipeline {
    agent { label 'docker' }
    stages {
        stage('Build') {
            steps {
                script {
                    props = readProperties file: 'gradle.properties'
                    VERSION = "${props.version}"
                }
                sh "docker build -t 'dtr.fintlabs.no/beta/springer:${VERSION}' ."
            }
        }
        stage('Publish') {
            when {
                branch 'master'
            }
            steps {
                withDockerRegistry([credentialsId: 'dtr-fintlabs-no', url: 'https://dtr.fintlabs.no']) {
                    sh "docker push 'dtr.fintlabs.no/beta/springer:${VERSION}'"
                }
            }
        }
    }
}
