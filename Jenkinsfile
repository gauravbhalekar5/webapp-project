pipeline {
      agent any
      stages {
            stage('Init') {
                  steps {
                        echo 'Hi, Welcome to DevOps'
                        echo 'We are Learning Jenkins'
                  }
            }
            stage('Build') {
                  steps {
                        echo 'Building Sample Maven Project'
                  }
            }
            stage('Deploy') {
                  steps {
                        echo "Deploying in Staging Area"
                  }
            }
            stage('Deploy Production') {
                  steps {
                        echo "Deploying in Production Area"
                  }
            }
      }
}
