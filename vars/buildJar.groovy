#!/user/bin/env groovy

def call(){
    echo "building application for branch $BRANCH_NAME"
    sh 'mvn package'
}